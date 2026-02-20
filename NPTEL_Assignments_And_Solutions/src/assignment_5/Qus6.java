package assignment_5;

class Qus6{
    public static void main(String[] args) {
        try{
            int a =5;
            int b=0;
            System.out.println(1/b);
        }catch (ArithmeticException e){
            System.out.print("Error ");
        }finally {
            System.out.print("Complete");
        }
    }
}