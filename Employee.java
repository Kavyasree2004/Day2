class Employee{
int eid;
String ename;
String depart;
void insertRecord(int r,String n, String m){
eid = r;
ename = n;
depart = m;
}
void displayInformation(){
System.out.println(eid+" "+ename+" "+depart);
}
}
class TestEmployee{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(111," Varun", " System Analyst");
e2.insertRecord(222," Arjun", " Programmer Developer");
e3.insertRecord(111," Vikram", " Manager");
e1.displayInformation();
e2.displayInformation();
e3.displayInformation();
}
}