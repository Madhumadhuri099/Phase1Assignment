package Assigment2;
import java.util.Scanner;

public class Email_idValidation {
public static void main(String[] args) {
		
		// searching of specific String 
	
				String[] emails= {"abc@gmail.com","def@gmail.com","ghi@gmail.com"};
				Scanner sc=new Scanner(System.in);
				System.out.println("Search here");
				String word=sc.next();
				for(String email:emails) {
					if(email.equals(word)) {
						System.out.println(word+" is found ");
						break;
					}
					else {
						System.out.println(word+" is not found  ");
					}
				}
			}


}
