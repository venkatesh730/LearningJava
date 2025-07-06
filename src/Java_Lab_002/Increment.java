package Java_Lab_002;

public class Increment {
    public static void main(String[] args) {
        int a=5;
        int b=a++ + ++a;
        System.out.println("a:" +a);
        System.out.println("b:" +b);
    }
}
