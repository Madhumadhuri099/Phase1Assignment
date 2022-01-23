
//19.You are given a project to demonstrate the uses of classes, objects, and the object-oriented pillars in Java.
package Phase1;

public class Program_19 {
	  String name; 
	    String breed; 
	    int age; 
	    String color; 
	    public Program_19(String name, String breed, int age, String color) 
	    { 
	        this.name = name; 
	        this.breed = breed; 
	        this.age = age; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public String getBreed() 
	    { 
	        return breed; 
	    } 
	    public int getAge() 
	    { 
	        return age; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
	    } 
	    public static void main(String[] args) 
	    { 
	    	Program_19 scott = new Program_19("Scott","papillon", 5, "black"); 
	        System.out.println(scott.toString()); 
	    } 
	
}
