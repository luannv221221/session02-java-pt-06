import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Mời bạn nhập vào số nguyên 0 - 9");
        num = scanner.nextInt();
        switch (num){
            case 0:
                System.out.println("Số không");
                break;
            case 1:
                System.out.println("Số một");
                break;
            case 2:
                System.out.println("Số hai");
                break;
            default:
                System.out.println("Nhập số không hợp lệ");

        }
    }
}
