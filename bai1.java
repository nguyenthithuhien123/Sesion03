import java.sql.Array;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**Khai báo mảng số nguyên gồm 5 phần tử, nhập giá trị các phần tử từ bàn phím
         * và in ra giá trị các phần tử của mảng*/
        int[] array = new int[5];
        System.out.println("Nhập các phần tử của mảng");

        System.out.print("Phần tử 1: \n");        array[0] = scanner.nextInt();
        System.out.print("Phần tử 2: \n");        array[1] = scanner.nextInt();
        System.out.print("Phần tử 3: \n");        array[2] = scanner.nextInt();
        System.out.print("Phần tử 4: \n");        array[3] = scanner.nextInt();
        System.out.print("Phần tử 5: \n");        array[4] = scanner.nextInt();

        System.out.print("Các phần tử của mảng là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }
}
