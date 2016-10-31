package lab3;

import java.util.*;

public class ListTest {
	
	static String input =  "";

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List list = new List();

		while(!input.equals("end")){
			
			System.out.print("A: Add a node");
			System.out.println();
			System.out.print("R: Retrieve a node");
			System.out.println();
			System.out.print("D: Delete a node");
			System.out.println();
			System.out.print("PT: Print list from tail");
			System.out.println();
			System.out.print("PH: Print list from head");
			System.out.println();
			System.out.print("END: Exit");
			System.out.println();
			System.out.print("Pick an option: ");
			
			input = in.nextLine();
			
			switch(input){
			case "A": System.out.print("Enter data value: ");
			int data = in.nextInt();
			in.nextLine();
			ListElement le = new ListElement(data);
			list.addElement(le);
			
			case "R": System.out.print("Enter index of node: ");
			int index = in.nextInt();
			in.nextLine();
			ListElement node = list.getElement(index);
			
			case "D": System.out.print("Enter index of node: ");
			index = in.nextInt();
			in.nextLine();
			list.deleteElement(index);
			
			case "PH": list.printLinkedListHead();
			}
		}
		
		in.close();
		
		System.out.println("Done");
	}

}
