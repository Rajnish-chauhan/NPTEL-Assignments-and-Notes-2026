package assignment_5;

interface Demo{
    void Display();
}
class  Test1 implements  Demo{
    @Override
    public void Display() {
        System.out.println("Hello, NPTEL!");
    }
}

public  class Qus4 {
    public static void main(String[] args) {
        Test1 obj=new Test1();
        obj.Display();
    }
}