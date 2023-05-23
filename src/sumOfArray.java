import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập arr: ");
            arr[i] = sc.nextInt();
        }
        System.out.print(sumArray(arr));
    }

    public static int sumArray(int[] arr) {
        int answer = 0;
        for (int j : arr) {
            answer += j;
        }
        return answer;
    }
}
