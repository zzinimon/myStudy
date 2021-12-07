package myProject;

import java.util.ArrayList;

public class Coding01 {

	public static void main(String[] args) {
		String[] lib= {"O ---","S ..."};
		String mes="... --- ...";
		 
		 System.out.println(solution(lib,mes));
	}
	public static String solution(String[] library, String message){
		String res="";
		char[] x= {};
		String[] y= {};
		String[] tmp= {};
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i].charAt(i));
			//x[i]=library[i].charAt(i);
			y[i]=library[i].substring(2);
		}
		tmp=message.split(" ");
		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < library.length; j++) {
				if(tmp[i]==library[j]) {res+=library[j];break;}
			}
		}
		return res;
    }
}
