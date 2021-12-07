package myProject;

public class Pro03 {

	public static void main(String[] args) {
//		System.out.println(solution());
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("Z", 10));
		System.out.println(solution("a B z", 4));
		System.out.println(solution(" aBZ", 20));
		System.out.println(solution("y X Z", 4));
		System.out.println(solution(" . h z", 20));

	}
	public static String solution(String s, int n) {
	       String answer = "";
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)==' ')answer+=" ";
				else{
					if(s.charAt(i)<='z'&& s.charAt(i)>='a'){//소문자?
						if((s.charAt(i)+n<='z'&&s.charAt(i)+n>='a'))answer+=(char)(s.charAt(i)+n);//숫자를 더해도 범위가 안넘어가?
						else answer+=(char)(s.charAt(i)+n-26);
					}else if(s.charAt(i)<='Z'&& s.charAt(i)>='A'){ //대문자?
						if((s.charAt(i)+n<='Z'&&s.charAt(i)+n>='A'))answer+=(char)(s.charAt(i)+n);//숫자를 더하도 범위가 안넘어?
						else answer+=(char)(s.charAt(i)+n-26);
					}
				}
	        }
			return answer;
	    }
}
