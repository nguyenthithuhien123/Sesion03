import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n:");
        int n = scanner.nextInt();
        do {
            System.out.println("""
                    *********************PRACTICE*********************
                    
                    1.\tIn dãy số chia hết cho 2 và giảm dần (n >= số >= 2)
                    2.\tIn các số nhỏ hơn n và tính tổng
                    3.\tIn ra các ước số chẵn của n
                    4.\tIn ra các ước số lẻ và số lượng các ước lẻ của n
                    5.\tIn ra ước số lẻ lớn nhất của n
                    6.\tThoát
                    **************************************************
                    """);
            System.out.print("Mời bạn chọn: ");
            byte chose = scanner.nextByte();
            switch (chose){
                case 1:
                    System.out.printf("Dãy số chia hết cho 2 giảm dần trong khoảng từ 2 đến %d là",n);
                    for (int i = n; i >=2; i--) {
                        if (i%2==0){
                            System.out.print("  "+i);
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    int total = 0;
                    System.out.print("Dãy số nhỏ hơn "+n+" là: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print("  "+i);
                        total +=i;
                    }
                    System.out.println();
                    System.out.print("Tổng các số nhỏ hơn "+n+" là: "+total);
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("Ước chẵn của %d là: ",n);
                    int count = 0;
                    for (int i = 2; i <=n/2 ; i++) {
                        if (n%i==0&&i%2==0){
                            System.out.print("  "+i);
                            count++;
                        }
                    }
                    if (count==0){
                        System.out.print(n+" không có ước chẵn nào cả");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("Các ước số lẻ của %d là: ",n);
                    int counts = 0;
                    for (int i = 1; i <=n/2 ; i++) {
                        if (n%i==0&&i%2!=0){
                            System.out.print("  "+i);
                            counts++;
                        }
                    }
                    System.out.println();
                    System.out.printf("%d có %d ước lẻ\n",n,counts);
                    System.out.println();
                    break;
                case 5:
                    System.out.printf("Các ước số lẻ lớn nhất của %d là: ",n);
                    for (int i = n/2; i >=1 ; i--) {
                        if (n%i==0&&i%2!=0){
                            System.out.print("  "+i);
                            System.out.println();
                          break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Xin cảm ơn!");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Mời bạn chọn từ 1-6");
            }
        }while (true);
    }
}
