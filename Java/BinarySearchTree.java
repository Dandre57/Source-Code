/* D'Andre Campbell
 */
import java.io.File;
import java.util.Scanner;

public class BinarySearchTree
{
  /**
   * Base Binary Tree Class
   */ 
  private class BinaryTree 
  {
    private String data;
    private BinaryTree left;
    private BinaryTree right;
    private BinaryTree root;
  
    public BinaryTree(String data) 
    {
      root = null;
      this.data = data;
      left = null;
      right = null;
    }
 
    public void setData(String data) 
    {
      this.data = data;
    }
 
    public String getData() 
    {
      return data;
    }

    public void setLeft(BinaryTree left) 
    {
      this.left = left;
    }
  
    public BinaryTree getLeft() 
    {
      return left;
    }

    public void setRight(BinaryTree right) 
    {
      this.right = right;
    }
    
    public BinaryTree getRight() 
    {
      return right;
    }
    
    public boolean isEmpty()
    {
      return root == null;
    }
  }
  
  private BinaryTree root;
  /** 
   * This method checks to see if a value is
   * in the binary tree
   */ 
  
  public boolean contains(int data, BinaryTree bstree)
  {
    if (bstree == null)
      return false;
    if (data == bstree.getData())
      return true;
    if (data < bstree.getData())
      return contains(data, bstree.getLeft());
    else 
      return contains(data, bstree.getRight());
  }
  
  /**
   * This method adds a value to the binary tree
   */ 
  public void insert(int data)
  {
    BinaryTree bt = new BinaryTree(data);

    if (root == null)
    {
      root = bt;
    }

    else
    {
      BinaryTree parIns = root;
      BinaryTree insNode = root;

      while (insNode != null)
      {
        parIns = insNode;
 
        if (data < insNode.getData())
        { 
          insNode = insNode.getLeft();
        }

        else 
        {
          insNode = insNode.getRight();
        }
      }

      if (data < parIns.getData())
      {
        parIns.setLeft(bt);
      }
      
      else 
      {
        parIns.setRight(bt);
      }
    }
  }
  
  public static void main(String[] args)
  {
    BinarySearchTree bst = new BinarySearchTree();
    File file = new File("/Users/dandrec/Desktop/Homework/Homework.txt");
    
    try 
    {
    Scanner sc = new Scanner(file);
    String line = sc.nextLine();
    String[] words = line.split(" ");
    int repetition = 0;
    
    for (int i = 0; i < words.length; i++)
    {
      bst.insert(words[i]);
      if (words[i - 1] == words[i])
        repetition++;
      System.out.println(words[i] + ": " + repetition);
    }
    
    }
    catch (Exception e)
    {
      System.out.println("File not found...");
    }
  }
}
