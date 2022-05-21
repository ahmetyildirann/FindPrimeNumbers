import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j;

        int bolenSayi=0;

        System.out.println("find the prime numbers up to numbers : ");
        Scanner scanner = new Scanner(System.in);
        int girilenSayi = scanner.nextInt();

        for (i=3; i<girilenSayi; i++){
            for (j=2; j<i; j++){
                if (i%j ==0) bolenSayi++;

            }
            if (bolenSayi==0) System.out.print(i+ " - ");
            bolenSayi=0;
        }
    }
}