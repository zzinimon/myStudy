package myPackage;

import java.util.*;

//RSA ��ȣȭ �� �Ҽ��� ��
public class SosuTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���:");
		int sosu=sc.nextInt();
		int su1,su2 = 1;
		
		for (su1 = 2;  su1< (sosu/2); su1++) {
			for (su2 = 1;  su2< (sosu/su1); su2++) {
				if(su1*su2==sosu) break;
			}
			if(su1*su2==sosu) break;
		}
		System.out.println("ù��° �� = "+su1);
		System.out.println("�ι�° �� = "+su2);
	}
}
/*
 test case: 24770429
 */