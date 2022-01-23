//Write a program to search a specific string from the given set of strings using regular expressions.
package Phase1;

public class Program_11 {
public static void main(String[] args) {
		
		// search specific String 
				String str="This is Madhuri";
				int index = str.indexOf("Madhuri");
				if(index==-1)
				{
					System.out.println("Madhuri not Found");
				}
				else
				{
					System.out.println("Madhuri is Found at index of "+index);
				}
			}


	

}
