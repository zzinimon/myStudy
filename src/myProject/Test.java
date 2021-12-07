package myProject;

public class Test {

	public static void main(String[] args) {
		int answer=0;
		for (int i = 1; i <= 99; i++) {
			answer+=Math.pow(i, 4);
		}
		System.out.println(answer);
	}

}
