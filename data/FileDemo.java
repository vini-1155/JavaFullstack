package data;
import java.io.*;
import java.util.Scanner;
public class FileDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Public\\VINAY-0604");
		
		file.mkdir();
		System.out.println("The text file is created");
		
		System.out.println("Enter the name of the file");
		Scanner sc = new Scanner(System.in);
		
		String filename = sc.next();
		File file1 = new File("C:\\Users\\Public\\VINAY-0604\\"+filename+".txt");
		filename = sc.nextLine();
		
		FileWriter fw = new FileWriter(file1);
	
		
//		String content = "World AIDS Day was first declared in 1988.\r\n"
//				+ "AIDS is a virus-caused disease.\r\n"
//				+ "HIV, when it enters the human body, damages the individual’s immunity system completely.\r\n"
//				+ "AIDS cause severe infections and health problems which if not taken medicine and proper treatment might kill the patient.\r\n"
//				+ "AIDS is not curable, but its effects are controlled through medicines and treatments.\r\n"
//				+ "Society very wrongly treated AIDS patients because of certain superstitions.\r\n"
//				+ "The awareness spread by the campaigns of World AIDS Day is to guide people about AIDS using facts.\r\n"
//				+ "Several NGOs are working towards uplifting the conditions of AIDS patients and helping them.\r\n"
//				+ "Around one million people die because of AIDS every year.";
		
		System.out.println("Write the essay:  ");
		
		String content = sc.nextLine();
		fw.write(content);
		fw.close();	
	}

}
