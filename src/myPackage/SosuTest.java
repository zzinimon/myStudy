package myPackage;

import java.util.*;

//RSA 암호화 두 소수의 곱
public class SosuTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 입력하세요:");
		int sosu=sc.nextInt();
		int su1,su2 = 1;
		
		for (su1 = 2;  su1< (sosu/2); su1++) {
			for (su2 = 1;  su2< (sosu/su1); su2++) {
				if(su1*su2==sosu) break;
			}
			if(su1*su2==sosu) break;
		}
		System.out.println("첫번째 수 = "+su1);
		System.out.println("두번째 수 = "+su2);
	}
}
/*
 test case: 24770429
 */