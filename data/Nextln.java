package data;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;
public class Nextln {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("C:\\Users\\Public\\VINAY-0604\\essay2.txt");
		int i;
//		while((i = fr.read())!= -1) {
//			System.out.print((char)i);
//		}
		
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		String words[];
		int norofwords = 0, norofsen = 0;
		String sentence[];
		while((line = br.readLine()) != null) {
			System.out.println(line);
			
			words = line.split(" ");
			sentence = line.split("[!?:.]+");
			norofwords += words.length;
			norofsen += sentence.length;
			
				
		}
		
		
		System.out.println("The number of words are "+ norofwords);
		System.out.println("The number of words are "+ norofsen);
		
		fr.close();
		System.out.println("FIle is Created and Written");

	}
}
