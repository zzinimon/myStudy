package myPackage;

import java.util.*;

//소수찾기
public class Pro02 {

	public static void main(String[] args) {
		System.out.println("4="+sol(10));
//		System.out.println("3="+sol(5));
	}
	public static int sol(int n) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for (int i = 2; n >= 2*i-1; i++) {
			arr.add(2*i-1);
		}
		for(int i=0; i<arr.size();i++) {
			for (int j = 2; arr.get(arr.size()-1) >= arr.get(i)*j; j++) {
				
				System.out.println(arr.get(i)*j);
				if(arr.contains(arr.get(i)*j)) arr.remove(arr.indexOf(arr.get(i)*j));
				System.out.println(arr.toString());
			}
		}
		
        return arr.size()+1;
	}
}
