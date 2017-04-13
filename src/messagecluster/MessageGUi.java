/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagecluster;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author L.S Computers
 */
public class MessageGUi extends JFrame{
    
    private MessageCluster stream;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;
    private JScrollPane scrollpane2;
    private JPanel panel;
    private ColorPane pane;
            
     public MessageGUi() throws IOException{
         panel = new JPanel(new GridLayout(1,2));
         
         stream=new MessageCluster();
         textarea1=new JTextArea("");
         
         scrollpane1=new JScrollPane(textarea1);
         
         textarea1.setEditable(false);
         
         for(int i=0;i<stream.size;i++)
         textarea1.append(stream.messages[i]+"\n");
         
         pane = new ColorPane();
        // pane.setEditable(false);
         
    for (int i = 0; i < stream.size; i++) {
      if (i<25) {
        pane.append(Color.red, stream.messages[i] + ' ');
      } else if ((i>25)&&(i<=50)) {
        pane.append(Color.blue, stream.messages[i] + ' ');
      } else if((i>50)&&(i<=75)){
        pane.append(Color.green, stream.messages[i] + ' ');
      } else if ((i>75)&&(i<=90)){
        pane.append(Color.cyan, stream.messages[i] + ' ');
      } else if ((i>90)&&(i<=115)){
        pane.append(Color.gray, stream.messages[i] + ' ');
      } else if ((i>115)&&(i<=140)){
        pane.append(Color.red, stream.messages[i] + ' ');
      } else if ((i>140)&&(i<=190)){
        pane.append(Color.blue, stream.messages[i] + ' ');
      }else if ((i>190)&&(i<=250)){
        pane.append(Color.gray, stream.messages[i] + ' ');
      }else if ((i>250)&&(i<=275)){
        pane.append(Color.green, stream.messages[i] + ' ');
      }else if ((i>275)&&(i<=stream.size)){
        pane.append(Color.magenta, stream.messages[i] + ' ');
      }
    }
         scrollpane2=new JScrollPane(pane);
         panel.add(scrollpane1);
         panel.add(scrollpane2);
         
         this.getContentPane().add(panel);
         
     }
     
     
    
}
