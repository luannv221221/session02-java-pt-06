import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        // kiểm tra tính hợp lệ
        do {
            System.out.println("Nhập vào số lớn hơn 0");
            num = scanner.nextInt();
            if(num < 0){
                System.err.println("vui lòng nhập số lơn hơn 0");
            }
        } while (num < 0);

    }
}
