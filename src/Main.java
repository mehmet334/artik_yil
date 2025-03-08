import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Yıl giriniz");
        Scanner scanner =new Scanner(System.in);

        int yil= scanner.nextInt();
        if (yil%100==0) {
            if (yil % 400 == 0) {
                System.out.println(yil + " bir artık yıldır!");
            } else {
                System.out.println(yil + " bir artık yıldır değildir!");
            }
        }else {
            if (yil % 4 == 0) {
                System.out.println(yil + " bir artık yıldır!");
            } else {
                System.out.println(yil + " bir artık yıldır değildir!");
            }
        }


    }
}