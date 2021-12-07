package myProject;
//5000000

public class Test2 {

	public static void main(String[] args) {
		int num=1234567890;
		int sum=0;
		int cnt=0;
		for (int i = 1; i <= 5000000; i++) {
			double pair=num*1.0/i;	//(i,pair)=¾à¼ö ½Ö
			if(pair%1==0.0) {
				sum+=i;
				cnt++;
			}
		}
		System.out.println(sum);
	}
	

}
