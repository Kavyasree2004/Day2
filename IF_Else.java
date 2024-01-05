import java.util.Scanner;
class IF_Else{
public static void main(String args[]){
int i,j;
Scanner sc=new Scanner(System.in);
i = sc.nextInt();
j = sc.nextInt();
if(j==0)
System.out.println("Division by error");
else
System.out.println(i+" dividend by "+j+" is "+(i/j));
i = i+j;
}
}