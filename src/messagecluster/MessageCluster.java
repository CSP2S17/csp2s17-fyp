/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagecluster;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author L.S Computers
 */
public class MessageCluster{
      
    protected String[] messages;
    protected int size;
    //constructor
    public MessageCluster() throws FileNotFoundException, IOException {
         CSVReader reader = null;
		try 
		{
			//Get the CSVReader instance with specifying the delimiter to be used
			reader = new CSVReader(new FileReader("GroupChat.csv"),',');
                        List<String[]>columns=new ArrayList<String[]>();
			String [] nextLine;
            
			//Read one line at a time
		    while ((nextLine = reader.readNext()) != null)
                             columns.add(nextLine);
                    
                     String[][] column =columns.toArray(new String[columns.size()][]);
                     size=columns.size();
                     messages=new String[size];
                     
                     
                    for(int i=0;i<size;i++)
                            messages[i]=column[i][2];
                    
                }
	    catch (Exception e) {
			e.printStackTrace();
		}
		finally	{
                    reader.close();
		}
    }
    public static void main(String[] args) throws IOException{
        MessageCluster streams=new MessageCluster();
        MessageGUi gui =new MessageGUi();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setTitle("MESSAGE STREAM ANALYSIS");
        gui.setSize(600, 600);
        
    }
}

    
    

