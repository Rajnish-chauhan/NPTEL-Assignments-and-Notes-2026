package assignment_5;

interface A{
    int x=10;
    void display();
}
class B implements A{
    @Override
    public void display() {
        System.out.println("Value of x: "+x);
    }
}
public class Qus7 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}