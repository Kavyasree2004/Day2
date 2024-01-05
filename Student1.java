class Student{
int id;
String name;
}
class TestStudent{
public static void main(String args[]){
Student s1 = new Student();   // we can create mutliple objs for the same class
Student s2 = new Student();
// Intialize the obj through reference variable
s1.id=533;
s1.name="Kavya";
s2.id=542;
s2.name="Vaishu";
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+" "+s2.name);
}
}