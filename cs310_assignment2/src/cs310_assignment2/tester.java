package cs310_assignment2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class tester {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String filePtr ="";

		System.out.println("Enter the file location here -> ");
		filePtr = input.nextLine();

		//File file = new File(filePtr);
		ArrayList<String> inputs = new ArrayList<String>();
		
		try {

			Scanner sc = new Scanner(new File(filePtr));
			while(sc.hasNext()){
				String raw = sc.next();
				inputs.add(raw);
				System.out.println(inputs.toString());
			}

			

			sc.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("File was not found" + e.getMessage());
		}
		
		
		for(int i =0; i<inputs.size(); i++) {
			
		}
	}

}
