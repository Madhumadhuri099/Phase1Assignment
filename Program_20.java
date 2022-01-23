//You are given a project to work and resolve the diamond problem using OOPs concepts.
package Phase1;

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
} 
public class Program_20 implements First,Second {
	  public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 


		 
		
		    public static void main(String args[]) 
		    { 
		    	Program_20 ob = new Program_20(); 
		        ob.show(); 
		    } 

}
