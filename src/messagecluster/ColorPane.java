/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagecluster;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author L.S Computers
 */
public class ColorPane extends JTextPane{
    
     public void append(Color c, String s) { // better implementation--uses
                      // StyleContext
    StyleContext sc = StyleContext.getDefaultStyleContext();
    AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY,
        StyleConstants.Foreground, c);

    int len = getDocument().getLength(); // same value as
                       // getText().length();
    setCaretPosition(len); // place caret at the end (with no selection)
    setCharacterAttributes(aset, false);
    replaceSelection(s); // there is no selection, so inserts at caret
  }
}
