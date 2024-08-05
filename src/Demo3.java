import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        for (int i = 0; i <=9; i++) {
            System.out.println("Xin chào");
        }
        // nhập vào số nguyên bất kỳ in ra số chẵn trong khoảng từ 1-> n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên bất kỳ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
