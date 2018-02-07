import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class DemoJFileChooser extends JPanel
   implements ActionListener {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JButton go,submit;
   JLabel label,label2,label3,label4,label5;
   JTextField tf1,tf2,tf3; 
   String selectedFile,findValue,replaceValue;
   JFileChooser chooser;
   String choosertitle;
   
  public DemoJFileChooser() {
	  label = new JLabel();
	  label4 = new JLabel();
	  label5 = new JLabel();
	  label.setText("Choose File:");
	  tf1=new JTextField(20);  
      tf1.setBounds(50,50,150,20);
      label2 = new JLabel();
	  label2.setText("Find : ");
	  label3 = new JLabel();
	  label3.setText("Replace with : ");
      tf2=new JTextField(20);  
      tf2.setBounds(50,100,150,20);  
    go = new JButton("Pick file");
    go.addActionListener(this);
    submit =new JButton("Submit");
    submit.addActionListener(this);
    add(label);
    add(go);
    add(label2);
    add (tf1);
    add(label3);
    add (tf2);
    add(submit);
    add(label4);
    add(label5);

   }

  public void actionPerformed(ActionEvent e) {
    int result=0;
    if(e.getSource()==go)   {
    chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    //
    // disable the "All files" option.
    //                                                                                                                             
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      System.out.println("getCurrentDirectory(): " 
         +  chooser.getCurrentDirectory());
      System.out.println("getSelectedFile() : " 
         +  chooser.getSelectedFile());
      
      label4.setText("SelectedFile : " + chooser.getSelectedFile());
      selectedFile = chooser.getSelectedFile().toString();
      System.out.println(selectedFile);
      }
    else {
      System.out.println("No Selection ");
      }
    }
    if(e.getSource()==submit){
    	findValue = tf1.getText();
    	replaceValue=tf2.getText();
    	System.out.println("Submitted");
    	result = modifyFile(selectedFile, findValue,replaceValue);
    	label5.setText("No of matching found =" +result );
    };
     }
   
  public Dimension getPreferredSize(){
    return new Dimension(200, 200);
    }
  
  public int modifyFile(String filePath, String oldString, String newString)
  {
      File fileToBeModified = new File(filePath);
       
      String oldContent = "";
       
      BufferedReader reader = null;
       
      FileWriter writer = null;
      int count = 0;
      try
      {
          reader = new BufferedReader(new FileReader(fileToBeModified));
           
          //Reading all the lines of input text file into oldContent
           
          String line = reader.readLine();
           
          while (line != null) 
          {
              oldContent = oldContent + line + System.lineSeparator();
               
              line = reader.readLine();
          }
          String str = oldContent;
          String findStr = oldString;
          int lastIndex = 0;
          

          while(lastIndex != -1){

              lastIndex = str.indexOf(findStr,lastIndex);

              if(lastIndex != -1){
                  count ++;
                  lastIndex += findStr.length();
              }
          }
          System.out.println(count);
           
          //Replacing oldString with newString in the oldContent
           
          String newContent = oldContent.replaceAll(oldString, newString);
           
          //Rewriting the input text file with newContent
           
          writer = new FileWriter(fileToBeModified);
           
          writer.write(newContent);
          
      }
      catch (IOException e)
      {
          e.printStackTrace();
      }
      finally
      {
          try
          {
              //Closing the resources
               
              reader.close();
               
              writer.close();
          } 
          catch (IOException e) 
          {
              e.printStackTrace();
          }
      }
      return count;
  }
    
  public static void main(String s[]) {
    JFrame frame = new JFrame("FilePicker");
    DemoJFileChooser panel = new DemoJFileChooser();
    frame.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
          }
        }
      );
    frame.getContentPane().add(panel,"Center");
    frame.setSize(200,200);
    frame.setVisible(true);
    }
}