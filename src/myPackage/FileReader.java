package myPackage;

import java.io.File;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		//MainOnly.java
	}
	
	static void read(String file) {
		try {
			File txt=new File(file);
			Scanner sc=new Scanner(txt);
			int i=1;
			while (sc.hasNextLine()) {
				String data =sc.nextLine();
				System.out.println(i+"th line:"+data);
				i++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static void readNthLine(String file, int n) {
		try {
			File txt=new File(file);
			Scanner sc=new Scanner(txt);
			int i=0;
			while (sc.hasNextLine()) {
				i++;
				if(i!=n)continue;
				String data =sc.nextLine();
				System.out.println(i+"th line:"+data);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
