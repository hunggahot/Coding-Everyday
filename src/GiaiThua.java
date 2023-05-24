import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n giai thừa: ");
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
