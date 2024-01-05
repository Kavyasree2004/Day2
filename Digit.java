import java.util.Scanner;
class Digit{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
  if(n==0||n==1||n==2||n==3||n==4||n==5||n==6||n==7||n==8||n==9)
   System.out.println("YES");
  else
   System.out.println("NO");
}
}