package lesson3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class handling {
	public static void createFileUsingFileClass() throws IOException {
		File file = new File("D:\\testFile.txt");

		if (file.createNewFile()) {
			System.out.println("File is Created");
		} else {
			System.out.println("File is already Exist");
		}
		FileWriter writer = new FileWriter(file, false);
		writer.write("Welcome Everyone .\nHow are you");
		writer.close();
	}
	public static void readFileReaderClass() throws IOException {
		FileReader reader = new FileReader("D:\\testFile.txt");

		Scanner read = new Scanner(reader);
		while (read.hasNext()) {
			String content = read.nextLine();
			System.out.println(content);
		}
	}
	public static void appendFileAppendClass() throws IOException {
		FileWriter writer = new FileWriter("D:\\testFile.txt", true);// appends File
		writer.write("\nHave a nice day!");
		writer.close();
	}
	public static void main(String args[]) {
		try {
			createFileUsingFileClass();
			System.out.println("File has created and Sucessfully written.\n");

			readFileReaderClass();
			System.out.println("File read done.");

			appendFileAppendClass();
			System.out.println("\nFile appended.");


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error" + e);
		}
	}
}