class Rectangle{
int length;
int width;
void insert(int l,int w){
length = l;
width = w;
}
void area(){
System.out.println(length*width);
}
}
class TestRectangle{
public static void main(String args[]){
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.insert(11,5);
r2.insert(3,15);
r1.area();
r2.area();
}
}