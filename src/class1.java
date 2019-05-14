import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age = ");
        int age = scanner.nextInt();
        if(age<18)
            System.out.println("Minor");
        else
            System.out.println("adult");

    }
}
