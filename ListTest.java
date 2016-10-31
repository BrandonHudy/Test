package lab3;

import java.util.*;

public class ListTest {
	
	static String input =  "";

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

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
			case "A": 
			}
		}
		
		in.close();
		
		System.out.println("Done");
	}

}
