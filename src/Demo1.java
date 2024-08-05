import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // if
        // nhập vào từ bàn phím 1 số bất kỳ nếu số nguyên đó là số chẵn thì ỉn ra màn hình
        // là số chẵn nếu không thì kết thúc chương trình
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Nhập vào số nguyên bất kỳ");
        num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println(num + "là số chẵn");
        } else {
            System.out.println(num + "là số lẻ");
        }

    }
}
