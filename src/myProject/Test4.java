package myProject;

//Ǯ���� ������ ��(1000000 ������ ��) cnt�� 4�� ������ ����
public class Test4 {
 public static void main(String[] args) {
    int cnt=0;
    int answer=0;
    for (Integer i = 10; i < 1000000; i++) {   //int i�� 1000000���� ����
       cnt=0;
       int len=i.toString().length();   //len�� �ڸ� �� ����
       Integer tmp=i;
       int mul=1;                  //mul �ʱ�ȭ
       do {
          mul=1;                  //mul �ʱ�ȭ
          for (int j = 0; j < len ; j++) { //�� �ڸ����� ���� Ȯ�� �� ��
             int digit=tmp%10;
             mul*=digit;
             tmp/=10;
          }
          tmp=mul;
          len=tmp.toString().length();
          cnt++;
       }while(mul/10!=0/*mul�� ���ڸ��� �̻�*/);
       //System.out.println(i+"=>"+cnt);
       if(cnt==4) {answer++;}
    }
    System.out.println(answer);
 }
}