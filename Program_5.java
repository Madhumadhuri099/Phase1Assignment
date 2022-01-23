//Write a program to demonstrate the uses of constructors and its types.
package Phase1;
//No Arguments constructor
class NoArgument_Constructors{
	
	public String name;
	
	public NoArgument_Constructors()
	{
		name="Ambaldhage Madhuri";
		
	}
}
//Parameterized Constructor

class ParameterizedConstructor
{
	public String name;
	
	public  ParameterizedConstructor(String name)
	{
		this.name=name;
		
	}
}
public class Program_5 {
public static void main(String[] args) {
		
		NoArgument_Constructors ut=new NoArgument_Constructors();
		System.out.println("No Arguments constructor : my name is "+ut.name);
		
		ParameterizedConstructor pc=new ParameterizedConstructor("This is Madhuri");
		System.out.println("ParameterizedConstructor : "+pc.name);

	}
}
