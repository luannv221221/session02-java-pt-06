import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        int choice;

        do {
            System.out.println("Nhập cạch thứ nhất ");
            a = scanner.nextInt();
            System.out.println("Nhập cạch thứ hai ");
            b = scanner.nextInt();
            System.out.println("Nhập cạch thứ ba ");
            c = scanner.nextInt();
            if(a + b > c && a + c > b && b + c > b){
                break;
            } else {
                System.err.println("3 cạch không phải là tâm giác vui lòng nhập lại");
            }
        } while (true);

        do {
            System.out.println("=============MENU==========");
            System.out.println("1. Tính diện tích tam giác");
            System.out.println("2. Tính chu vi tam giác");
            System.out.println("3. THoát chương trình");
            System.out.println("Mời bạn chọn 1 - 3");
            choice = scanner.nextInt();
            double cv = (a + b +c);
            switch (choice){
                case 1:
                    double s = Math.sqrt(cv/2*(cv/2-a) * (cv/2-b) * (cv/2-c));
                    System.out.println("diện tích tam giác là : "+s);
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Chọn sai mwifo chọn lại");
            }

        } while (true);
    }
}
