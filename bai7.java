import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("*****************CACULECTER*****************");
            System.out.print("1.\tTong ba so nguyen\n");
            System.out.println( "2.\tTrung binh cong cua 3 so nguyen\n");
            System.out.println( "3.\tSo lon nhat nho nhat trong ba so\n");
            System.out.println("4.\tThoat\n");
            System.out.println("Lua chon cua ban");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap so 1: ");
                    float s1 = sc.nextFloat();
                    System.out.println("Nhap so 2: ");
                    float s2 = sc.nextFloat();
                    System.out.println("Nhap so 3: ");
                    float s3 = sc.nextFloat();
                    System.out.println("tong 3 so nguyen la"+(s1+s2+s3));
                    break;
                case 2:
                    System.out.println("Nhap so 1: ");
                    float a1 = sc.nextFloat();
                    System.out.println("Nhap so 2: ");
                    float a2 = sc.nextFloat();
                    System.out.println("Nhap so 3: ");
                    float a3 = sc.nextFloat();
                    System.out.println("tong 3 so nguyen la"+((a1+a2+a3)/3));
                    break;
                case 3:
                    System.out.println("Nhap so 1: ");
                    float c1 = sc.nextFloat();
                    System.out.println("Nhap so 2: ");
                    float c2 = sc.nextFloat();
                    System.out.println("Nhap so 3: ");
                    float c3 = sc.nextFloat();
                    float max = c1;
                    float min = c1;
                    if (max<=c2) {
                        max = c2;
                        if (max<=c3){
                            max=c3;
                        }
                    }
                    System.out.println("so lon nhat la "+max);
                    if (min>=c2) {
                       min = c2;
                        if (min>=c3){
                            min=c3;
                        }
                    }
                    System.out.println("so nho nhat la "+min);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chon lai tu 1-4");
            }
        }while (true);
        }


}
