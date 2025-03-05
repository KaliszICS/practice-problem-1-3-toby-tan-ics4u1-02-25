import java.io.*; //required to open files in java
import java.util.Scanner;

class Notes {
	public static void main(String[] args) {
		//create a fileReader

		// FileReader inputStream = null;

		// try {
		// 	inputStream = new FileReader("testfile.txt"); //FileReader(filename)

		// 	int c; //character by character

		// 	while ((c = inputStream.read()) != -1) { //reading from the file
		// 		//-1 means that the read() found no character
		// 		System.out.print((char)c);
		// 	}
		// }
		// catch (IOException e) {
		// 	System.out.println(e);
		// }
		// finally { //runs regardless of whether the catch happens or not
		// 	//finally even runs if the the function returned during the try or catch
		// 	try {
		// 		if (inputStream != null) {
		// 			inputStream.close();
		// 		}
		// 	}
		// 	catch (IOException e) {
		// 		System.out.println(e);
		// 	}
		// }

	

		
		// BufferedReader inputStream = null;

		// try {
		// 	inputStream = new BufferedReader(new FileReader("testfile.txt"));

		// 	String line;
		// 	//when readLine() == null, we have reached the end of the file
		// 	while ((line = inputStream.readLine()) != null) { //does not read newline characters
		// 		System.out.println(line);
		// 	}
		// }
		// catch (IOException e) {
		// 	System.out.println("There was an IOException thrown");
		// }
		// finally {
		// 	try {
		// 		if (inputStream != null) {
		// 			inputStream.close();
		// 		}
		// 	}
		// 	catch (IOException e) {
		// 		System.out.println(e);
		// 	}
		// }
		

		Scanner s = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader("testfile.txt")));

			while (s.hasNext()) { 
				System.out.print(s.next() + " "); //.next stops at punctuation, spaces, and newlines
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			if (s != null) {
				s.close();
			}
		}
		/*
		The scanner read in other data types besides strings
		It can also validate that the information is that data 		
		type before doing so
		hasNextDouble
		nextDouble
		hasNextInt
		nextInt
		hasNextBoolean
		nextBoolean
		nextLine
		*/
	}
}
