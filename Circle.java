class Circle{
int radius;
void insert(int r){
radius = r;
}
void area(){
System.out.println(3.14*radius*radius);
}
}
class TestCircle{
public static void main(String args[]){
Circle c1=new Circle();
Circle c2=new Circle();
c1.insert(11);
c2.insert(3);
c1.area();
c2.area();
}
}