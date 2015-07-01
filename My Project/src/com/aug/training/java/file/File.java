package com.aug.training.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class File {
	
	private static Scanner Sc = new Scanner(System.in);
	public static void main(String[] args) throws FileException {
	    
		String filename;
		int x;
		boolean choice = true;
		String input;
		while(choice) {
		System.out.println("\n+++ Please select 1 choice +++ \n");
		System.out.println("Press 1 for read a file ");
		System.out.println("Press 2 for write a file ");
		System.out.println("Press 3 for exit  ");
		System.out.print("You select :: ");
		x = Sc.nextInt();
		
		if (x==1) {
		System.out.println("Enter file name : ");
		filename = Sc.next();
		
		try {
			// สร้าง object เพื่อใช้อ่านไฟล์ โดยระบุชื่อไฟล์ที่ต้องการอ่าน
			FileReader reader = new FileReader(
					System.getProperty("user.dir") + "/file/" +filename);

			// สร้าง object เพื่อใช้อ่านข้อมูลลงไปในไฟล์
			BufferedReader out = new BufferedReader(reader);

			String text;
			while ((text = out.readLine()) != null) {

				System.out.println(text);
			}
			

		} catch (Exception exception) {
			System.out.println("---File not found---");
		//	throw new FileException("---File not found---") ;
		} 
		
			
			} else if (x == 2) {
				System.out.println("Enter file name : ");
				filename = Sc.next();
				try {
					// สร้าง object เพื่อใช้เขียนไฟล์
					// โดยระบุชื่อไฟล์ที่ต้องการสร้าง
					FileWriter writer = new FileWriter(
							System.getProperty("user.dir") + "/file/"+ filename);

					// สร้าง object เพื่อใช้เขียนข้อมูลลงไปในไฟล์
					BufferedWriter out = new BufferedWriter(writer);

					// เขียนข้อมูลลงไปในไฟล์
					System.out.println("Insert your message : ");
					input = Sc.nextLine();
					while (!(input = Sc.nextLine()).equals("end")){
						out.write(input);
						out.newLine();
					}

					// ปิดการเขียนไฟล์
					out.close();
					System.out.println("Create file success");

				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
			} else if (x == 3) {
				System.out.println("+++ EXIT ! +++");
				choice = false;
				break;

			} else {
				System.out.println("...Please select again...\n");
		}
		}

}
}
