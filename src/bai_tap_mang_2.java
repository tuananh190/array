import java.util.Scanner;

public class bai_tap_mang_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang2 = new int[5];

        for (int i = 0; i < mang2.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");

            mang2[i] = scanner.nextInt();
        }
        System.out.println("các phần tử trong mảng là");
        for (int i = 0; i < mang2.length; i++) {
            System.out.print(mang2[i] + " ");
        }
        int tong = 0;
        for (int i = 0; i < mang2.length; i++) {
            tong += mang2[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: " + tong);
        scanner.close();

    }
}
