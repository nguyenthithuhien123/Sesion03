import java.io.PrintStream;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so thu nhat: ");
        int numBer1 =sc.nextInt();
        System.out.println("Moi ban nhap so thu hai: ");
        int numBer2 = sc.nextInt();
        do {
            System.out.println("""
                                    
                    *********************CACULATOR*********************
                    1.\tTổng 2 số
                    2.\tHiệu 2 số
                    3.\tTích 2 số
                    4.\tThương 2 số
                    5.\tSố dư trong phép chia 2 số
                    6.\tƯớc chung lớn nhất
                    7.\tBội chung nhỏ nhất
                    8.\tThoat""");
            System.out.println("Moi ban chon");
            byte chose = sc.nextByte();
            switch (chose) {
                case 1:
                    System.out.println("Tong hai so la: " + (numBer1 + numBer2));
                    break;
                case 2:
                    System.out.println("Hieu hai so la: " + (numBer1 - numBer2));
                    break;
                case 3:
                    System.out.println("Tich hai so la" + (numBer1 * numBer2));
                    break;
                case 4:
                    if (numBer2 != 0) {
                        System.out.println("Thuong hai so la: " + numBer1 / numBer2);
                    } else {
                        System.err.println("Chia cho khong la khong hop le");
                    }
                    break;
                case 5:
                    if (numBer2 != 0) {
                        System.out.println("Thuong hai so la: " + (numBer1 % numBer2));
                    } else {
                        System.err.println("Chia cho khong la khong hop le");
                    }
                    break;
                case 6:
                    int ucln = 1;
                    for (int i = 1; i <= numBer1 && i <= numBer2; i++) {
                        if (numBer1 % i == 0 && numBer2 % i == 0) {
                            ucln = i;
                        }
                    }
                    System.out.printf("Uoc chung lon nhat cua 2 so %d va %d la %d", numBer2, numBer1, ucln);
                    break;
                case 7:
                    double sl = Math.max(numBer1, numBer2);
                    while (true) {
                        if (sl % numBer1 == 0 && sl % numBer2 == 0) {
                            System.out.println("Boi chung  nho nhat la: " + sl);
                            break;
                        }
                        ++sl;
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("Moi ban chon lai tu 1-8");
            }
        } while (true);
    }
}
