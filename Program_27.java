//27."Write a program to create and perform operations on the circular linked list.
package Phase1;

public class Program_27 {
	static class Node 
	{ 
		int data; 
    		Node next; 
            	Node(int d) 
    		{ 
        			data = d; 
        			next = null; 
    		} 
}
Node head; 
Program_27()   
{ 
head = null; 
} 
	void sortedInsert(Node new_node) 
	{ 
    		Node current = head; 
if (current == null) 
    		{ 
        			new_node.next = new_node; 
        			head = new_node; 
		} 
else if (current.data >= new_node.data) 
    		{ 
while (current.next != head) 
            			current = current.next; 
		 	current.next = new_node; 
        			new_node.next = head; 
        			head = new_node; 
    		} 
    		else
    		{
while (current.next != head && current.next.data < new_node.data) 
            			current = current.next; 
			new_node.next = current.next; 
        			current.next = new_node; 
    		} 
}
void printList() 
	{ 
    		if (head != null) 
   		{ 
        			Node temp = head; 
        			do
       			{ 
            			System.out.print(temp.data + " "); 
            			temp = temp.next; 
        			}  while (temp != head); 
    		} 
	}
public static void main(String[] args) 
	{ 
Program_27 list= new Program_27(); 
    		int arr[] = new int[] {12, 56, 2, 11, 1, 90}; 
    		Node temp = null; 
    		for (int i = 0; i < 6; i++) 
    		{ 
       			temp = new Node(arr[i]); 
        			list.sortedInsert(temp); 
    		} 
list.printList(); 
	}		 

}
