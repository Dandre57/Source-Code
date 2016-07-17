import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

public class TextEditor extends JFrame 
{
  private JTextArea area = new JTextArea(25, 75); // Controls the size of the window
  private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
  private String currentFile = "Untitled"; // Title of file until it is named
  private boolean changed = false;
  private File file;
  private Font option1, option2, option3, option4;
  private String command;
  
  public TextEditor() 
  {
    JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    add(scroll, BorderLayout.CENTER);
    area.setFont(new Font("Times New Roman", Font.PLAIN, 12));
    
    JMenuBar menu = new JMenuBar();
    setJMenuBar(menu);
    
    JMenu file = new JMenu("File");
    file.add(New);
    file.add(Open);
    file.add(Save);
    file.add(SaveAs);
    file.add(Quit);
    file.addSeparator();
    
    JMenu edit = new JMenu("Edit");
    edit.add(Cut);
    edit.add(Copy);
    edit.add(Paste);
    
    edit.getItem(0).setText("Cut");
    edit.getItem(1).setText("Copy");
    edit.getItem(2).setText("Paste");
    
    JMenu format = new JMenu("Format");
    
    JMenu font = new JMenu("Font");
    format.add(font);
    
    JMenu style = new JMenu("Styles");
    JMenu size = new JMenu("Size");
    
    font.add(style);
    font.add(size);

    style.add(Cambria);
    style.add(Calibri);
    style.add(Arial);
    style.add(TimesNewRoman);
    
    JMenu size1 = new JMenu("12");
    JMenu size2 = new JMenu("14");
    JMenu size3 = new JMenu("16");
    JMenu size4 = new JMenu("18");
    
    size.add(size1);
    size.add(size2);
    size.add(size3);
    size.add(size4);
    
    for(int i = 0; i < 4; i++)
    {
      file.getItem(i).setIcon(null);
    }
    
    menu.add(file); 
    menu.add(edit);
    menu.add(format);
    
    JToolBar tool = new JToolBar();
    add(tool,BorderLayout.NORTH);
    tool.add(New);
    tool.add(Open);
    tool.add(Save);
    tool.addSeparator();

    Save.setEnabled(false);
    SaveAs.setEnabled(false);
    
    pack();
    area.addKeyListener(majorKey);
    setTitle(currentFile + " - Text Editor");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  
  private KeyListener majorKey = new KeyAdapter() 
  {
    public void keyPressed(KeyEvent e) 
    {
      changed = true;
      Save.setEnabled(true);
      SaveAs.setEnabled(true);
    }
  };
  
  Action New = new AbstractAction("New", new ImageIcon("new.gif")) 
  {
    public void actionPerformed(ActionEvent e) 
    {
      String newFile;
      newFile = JOptionPane.showInputDialog(null, "Enter name of file: ");
      
      try
      {
        file = new File(newFile);
        
        if(file.createNewFile())
          JOptionPane.showMessageDialog(null, "File created !");
        else
          JOptionPane.showMessageDialog(null, "File already exists");
      }
      catch(Exception exception)
      {
        JOptionPane.showMessageDialog(null, "Error");
      }
    }
  };
  
  Action Open = new AbstractAction("Open", new ImageIcon("open.gif")) 
  {
    public void actionPerformed(ActionEvent e) 
    {
      saveOld();
      if(dialog.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) 
      {
        readInFile(dialog.getSelectedFile().getAbsolutePath());
      }
      SaveAs.setEnabled(true);
    }
  };
  
  Action Save = new AbstractAction("Save", new ImageIcon("save.gif")) 
  {
    public void actionPerformed(ActionEvent e) 
    {
      if(!currentFile.equals("Untitled"))
        saveFile(currentFile);
      else
        saveFileAs();
    }
  };
  
  Action SaveAs = new AbstractAction("Save As") 
  {
    public void actionPerformed(ActionEvent e) 
    {
      saveFileAs();
    }
  };
  
  Action Quit = new AbstractAction("Quit") 
  {
    public void actionPerformed(ActionEvent e) 
    {
      saveOld();
      System.exit(0);
    }
  };
  
  ActionMap map = area.getActionMap();
  Action Cut = map.get(DefaultEditorKit.cutAction);
  Action Copy = map.get(DefaultEditorKit.copyAction);
  Action Paste = map.get(DefaultEditorKit.pasteAction);

  private void saveFileAs() 
  {
    if(dialog.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
      saveFile(dialog.getSelectedFile().getAbsolutePath());
  }
  
  private void saveOld() 
  {
    if(changed) 
    {
      if(JOptionPane.showConfirmDialog(this, "Would you like to save "+ currentFile +" ?","Save",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
        saveFile(currentFile);
    }
  }
  
  private void readInFile(String fileName) 
  {
    try 
    {
      FileReader reader = new FileReader(fileName);
      area.read(reader,null);
      reader.close();
      currentFile = fileName;
      setTitle(currentFile);
      changed = false;
    }
    catch(IOException e) 
    {
      Toolkit.getDefaultToolkit().beep();
      JOptionPane.showMessageDialog(this,"Editor can't find the file called "+fileName);
    }
  }
  
  private void saveFile(String fileName) 
  {
    try 
    {
      FileWriter writer = new FileWriter(fileName);
      area.write(writer);
      writer.close();
      currentFile = fileName;
      setTitle(currentFile);
      changed = false;
      Save.setEnabled(false);
    }
    catch(IOException e) 
    {
      System.out.println("Error");
    }
  }
  
  Action Cambria = new AbstractAction("Cambria", new ImageIcon("cambria.gif")) 
  {
    public void actionPerformed(ActionEvent e) 
    {
    option1 = new Font("Cambria", Font.PLAIN, 12);
    area.setFont(option1);
    }
  }; 
  Action Calibri = new AbstractAction("Calibri", new ImageIcon("calibri.gif")) 
  {
    public void actionPerformed(ActionEvent e) 
    {
    option2 = new Font("Calibri", Font.PLAIN, 12);
    area.setFont(option2);
    }
  };

  Action Arial = new AbstractAction("Arial", new ImageIcon("arial.gif")) 
  {
    public void actionPerformed(ActionEvent e) 
    {
    option3 = new Font("Arial", Font.PLAIN, 12);
    area.setFont(option3);
    }
  };

  Action TimesNewRoman = new AbstractAction("Times New Roman", new ImageIcon("Times New Roman.gif")) 
  {
    public void actionPerformed(ActionEvent e) 
    {
    option4 = new Font("Times New Roman", Font.PLAIN, 12);
    area.setFont(option4);
    }
  };

  /*
   * Add methods for font sizes
   */ 
   
  public  static void main(String[] arg) 
  {
    new TextEditor();
  }
}
