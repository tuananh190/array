import java.util.Scanner;

public class bai_tap_mang_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang1 = new int[5];

        // Nhập giá trị cho từng phần tử
        for (int i = 0; i < mang1.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": "); // +i+ dùng để cho người dùng nhập dữ liệu vô mảng
            mang1[i] = scanner.nextInt();  // scanner.nextInt() : đây là phương thức của scanner để đọc số nguyên
        }

        // In tất cả các phần tử
        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < mang1.length; i++) {
            System.out.print(mang1[i] + " ");
        }
        System.out.println();

        // Tính tổng các phần tử
        int tong = 0;
        for (int i = 0; i < mang1.length; i++) {
            tong += mang1[i];
        }

        // In tổng
        System.out.println("Tổng các phần tử trong mảng là: " + tong);
        scanner.close();
    }
}
