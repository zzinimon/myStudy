package myProject;

public class Coding02 {

	public static void main(String[] args) {
		int[] arr = {10,0,0,4,20};
		int num = 8;
		System.out.println(solution(arr, num));
		System.out.println(sol2(arr, num));
		
	}
	public static int solution(int[] arr, int num){
		int res=0;
		int tmp=0;
		for (int i = 0; i < arr.length; i++) {
			tmp+=arr[i]-num;
			if (tmp<0) {tmp=0;res++;continue;}
			res++;
		}
		while (tmp<0) {
			tmp-=num;
			res++;
		}
			
        return res;
    }
	public static int sol2(int[] arr, int num){
		  int remain = 0;
	      int count = 0;
	      for (int i = 0; i < arr.length; i++) {
	         remain += arr[i];
	         if(remain==0) continue;
	         remain -= num;
	         count++;
	         if(remain<0) remain=0;
	      }
	      count += remain/num + (remain%num==0 ? 0:1);
	      return count;
	}
}
