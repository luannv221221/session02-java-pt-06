import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int choice;
        System.out.println("Mời bạn vào số nguyên dương bất kỳ ");
        num = scanner.nextInt();

        do {
            System.out.println("=======MENU======");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số ");
            System.out.println("2. Kiểm tra số nguyên tố ");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn từ 1 - 4");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    if(num % 2 == 0){
                        System.out.println("Số chẵn");
                    } else {
                        System.out.println("Số lẻ");
                    }
                    break;
                case 2:
                    if(num <= 1){
                        System.out.println("Không phải số nguyên tố");
                        break;
                    }
                    boolean flag = true;
                    for (int i = 2; i < num; i++) {
                        if(num % i == 0){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println("Số nguyên tố");
                    } else {
                        System.out.println("Không phải số nguyên tố");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn lại");
            }
        } while (true);

    }
}
