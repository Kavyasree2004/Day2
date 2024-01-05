import java.util.Scanner;
class Consonant{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 char c = sc.next().charAt(0);
  if((c>='A' && c<='Z')||(c>='a' && c<='z')){
    if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
      System.out.println("VOWEL");
    else
      System.out.println("CONSONANT");
}
  else{
      System.out.println("Not a Alphabet");
}                                           
}
}