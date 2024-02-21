import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**Nhập vào số phần tử (n) của mảng 1 chiều, khai báo và
         * nhập giá trị các phần tử của mảng một chiều số thực gồm n phần tử.
         * In ra giá trị trung bình cộng của các phần tử trong mảng*/
        System.out.print("Nhập vào số phần tử của dãy: \n");
        do {
        int n = scanner.nextInt();
        if (n>0){
            float[] arrayFloat = new float[n];
            float total = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ: "+(i+1));
            arrayFloat[i]=scanner.nextFloat();
            total = total+arrayFloat[i];
        }
        System.out.print("Giá trị trung bình cộng của các phần tử là: "+(total/n));
        }else {
            System.err.println("Nhập số phần tử của mảng lớn hơn 0");
        }
        }while (true);
    }
}
