package com.yaksha.assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		// **Create a file instance**
		File file = new File("writeFile.txt");

		try {
			// Check if the file exists, if not, create it
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File created: " + file.getName());
			}

			// **Write to the file**
			FileWriter writer = new FileWriter(file);
			writer.write("This is a sample text written to the file.\n");
			writer.close();
			System.out.println("Successfully wrote to the file.");

		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}
}
