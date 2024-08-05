import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("=============MENU==============");
            System.out.println("1. Món gà ");
            System.out.println("2. Món heo ");
            System.out.println("3. Món cá ");
            System.out.println("4. Món thịt chó ");
            System.out.println("5. Thoát chương trình");
            System.out.println("Mời bạn chọn 1 - 5");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Mời ăn gà");
                    break;
                case 2:
                    System.out.println("Mời bạn ăn heo");
                    break;
                case 3:
                    System.out.println("Mời bạn ăn cá");
                    break;
                case 4:
                    System.out.println("mời bạn ăn chó");
                    break;
                case 5:
                    System.exit(0); // câu lệnh thoát chương trình
                default:
                    System.out.println("Sai lựa chọn vui lòng chọn lại");
            }
        } while (true);

    }
}
