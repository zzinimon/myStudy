package myProject;
//나머지가 1이 되는 수 찾기
public class Pro01 {

	public static void main(String[] args) {
		int n1=10;
		int n2=12;
		System.out.println("3="+sol(10));
		System.out.println("11="+sol(12));
	}
	public static int sol(int n) {
		int x;
		for (x = 2; x <= n-1; x++) {
			if(n%x==1) break;
		}
		return x;
	}
}
