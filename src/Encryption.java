import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Encryption {
	
	// Declare instance variables
	private Scanner scanner;
	private Random random;
	private ArrayList<Character> list;
	private ArrayList<Character> shuffledList;
	private char character;
	private String line;
	private char[] letters;
	
    // Constructor
	Encryption(){
		
		// Initialise instance variables
		scanner = new Scanner(System.in);
		random = new Random();
		list = new ArrayList();
		shuffledList = new ArrayList();
		character = ' ';
		
		// Call methods to start the program
		newKey();
		askQuestion();

		
	}
	
	// Main loop for asking user input
	private void askQuestion() {
		while (true) {
			System.out.println("---------------------------------");
			System.out.println("Type for an option:");
			System.out.println("NewKey\nGetKey\nEncrypt\nDecrypt\nQuit");
			System.out.println("---------------------------------");
			
			// Check if user input is empty before processing.
			String input = scanner.nextLine();
			if(input.isEmpty()) {
			    System.out.println("Please enter a valid option.");
			    continue;
			}
			// Get the first character of the user's input and convert it to uppercase
			char response = Character.toUpperCase(scanner.nextLine().charAt(0));
			
			// Use a switch statement to handle user choices
			switch(response ) {
			case 'N':
				newKey();
				break;
				
			case 'G':
				getKey();
				break;
				
			case 'E':
				encrypt();
				break;
				
			case 'D':
				decrypt();
				break;
				
			case 'Q':
				quit();
				break;
			
		    // If none of the above cases match
			default:
					System.out.println("Not a valid answer");
			}
			
		}
			
	}
	
	private void newKey() {
		
		// Reset and clear previous data
		character = ' ';
		list.clear();
		shuffledList.clear();
		
		 // Populate the list with ASCII characters 
		for(int i=32;i<127;i++) {
			list.add(Character.valueOf(character));
			character++;
		}
		
    // Creates a copy of the original list and shuffles it
	shuffledList = new ArrayList(list);
	Collections.shuffle(shuffledList);
	System.out.println("A new key has been generated");
		
		
	}
	
	private void getKey() {
		
		// Prints the original sequence of characters
		System.out.println("Key: ");
		for(Character x : list) {
			System.out.print(x);
		}
	    
	    // Prints the shuffled (encrypted) sequence of characters
		System.out.println();
		for(Character x : shuffledList) {
			System.out.print(x);
		}
		
	}
	
	private void encrypt() {
		System.out.println("Enter a message to be encrypted:");
		String message = scanner.nextLine();
		
		// Convert the message string into a character array
		letters = message.toCharArray();
		System.out.println(letters);
		
		// Loop through each character in the input message
		for(int i= 0;i<letters.length;i++) {
			 // For each character, find itin the 'list' and replace it with the character from 'shuffledList'
			for(int j= 0;j<list.size();j++)  {
				if(letters[i]==list.get(j)) {
					// Replace the character with the corresponding encrypted character
					letters[i]=shuffledList.get(j);
					// Stop searching further once a match is found
					break;
				}
				
			}
			
		}	
		System.out.println("Encrypted: ");
		for(char x : letters) {
			System.out.print(x);
		}
		System.out.println();
		
	}
	private void decrypt() {
		System.out.println("Enter a message to be decrypted:");
		String message = scanner.nextLine();
		
		// Convert the message string into a character array
		letters = message.toCharArray();
		System.out.println(letters);
		
		// Same process but as encrypted but backwards
		for(int i= 0;i<letters.length;i++) {
			for(int j= 0;j<shuffledList.size();j++)  {
				if(letters[i]==shuffledList.get(j)) {
					letters[i]=list.get(j);
					break;
				}
				
			}
			
		}	
		System.out.println("Decrypted: ");
		for(char x : letters) {
			System.out.print(x);
		}
		System.out.println();
		
	}
		
	 private void quit() {
		 System.out.println("Goodbye!");
		 System.exit(0);
	 }
}
