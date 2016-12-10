/* D'Andre Campbell
 */ 

import java.util.Scanner;

public class StackQueue
{
   private int size = 0;
   private Hero root = null;
   private String[] elements;
   private int front;
   private int rear; 
   private int queueSize;
   
   private class Hero
   {
     private String name;
     private int nemesis;
     private double travelTime;
     private Hero next;
     private Hero prev;
     
     public Hero(String name, int nemesis, double travelTime)
     {
       this.name = name;
       this.nemesis = nemesis;
       this.travelTime = travelTime;
       this.next = null;
       this.prev = null;
     }
     
     public Hero(String name, int nemesis, double travelTime, Hero next, Hero prev)
     {
       this.name = name;
       this.nemesis = nemesis;
       this.travelTime = travelTime;
       this.next = next;
       this.prev = prev;
     }
  
     public String getName()
     {
       return name;
     }
  
     public int getNemesis()
     {
       return nemesis;
     }
  
     public double getTravelTime()
     {
       return travelTime;
     }
  
     public void setNext(Hero nextHero)
     {
       next = nextHero;
     }
  
     public Hero getNext()
     {
       return next;
     }
     
     public void setPrev(Hero prevHero)
     {
       prev = prevHero;
     }
  
     public Hero getPrev()
     {
       return prev;
     }
  
     public void info()
     {
       System.out.println("Name: " + name + "\n" +
                          "Nemesis: " + nemesis + "\n" +
                          "Time: " + travelTime);
     }
   }
   
   public StackQueue(int capacity)
   {
    elements = new String[capacity];
    front = 0;
    rear = 0;
    size = 0;
   }
   
   public int size() 
   {
     return size;
   }

   public void push(String name, int nemesis, double travelTime) 
   {
     root = new Hero(name, nemesis, travelTime);
     size++;
   }

   public Object pop() 
   {
     if (isEmpty()) 
     {
       throw new RuntimeException("Stack underflow");
     }
     String item1 = root.getName();      
     root = root.getNext();    
     
     int item2 = root.getNemesis();
     root = root.getNext();
     
     
     double item3 = root.getTravelTime();
     root = root.getNext();
     
     size--;
     return item1 + item2 + item3;
   }

   public boolean isEmpty() 
   { 
     return root == null; 
   }
    
   public void printList()
   {
     Hero current = root;
     while(current!=null)
     {
       System.out.println(current.toString());
       current = current.getNext();
     }
   }
   
   public int queueSize()
   {
     return elements.length;
   }
  
   public boolean empty()
   {
     return size == 0;
   }
  
   public void enqueue(String s)
   {
     if (size == elements.length)
       System.out.println("Thats it...");
    
     else 
     {
       size ++;
       elements[rear] = s;
       rear ++;
       if (rear == elements.length)
         rear = 0;
     }
   }
  
   public String dequeue()
   {
     if (empty())
     {
       String str = "Thats it...";
       return str;
     }
    
     else 
     {
       size --;
       String value = elements[front];
       
       elements[front] = null;
      
       front ++;
       if (front == elements.length)
         front = 0;
      
       return value;
     }
   }
  
  
   public void dequeueAll()
   {
     for(int i = 0; i < size(); i++)
     {
       System.out.println(dequeue());
     }
   }
   
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);    
     StackQueue q = new StackQueue(5);
     
     System.out.println("Input number of sharks: ");
     int numOfSharks = sc.nextInt();
     
     System.out.println("Input hero's name: ");
     String name = sc.next();
     
     System.out.println("Input nemesis's number: ");
     int nemesis = sc.nextInt();
     
     System.out.println("Input travelTime: ");
     double travelTime = sc.nextDouble();
      
     System.out.println(name + " " + nemesis + " " + travelTime);
     System.out.println(name + " has been captured.");
     System.out.println(name + " has been eaten");

   }
}
