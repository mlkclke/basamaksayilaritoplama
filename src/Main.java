import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner input =new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        a = input.nextInt();

        int toplam=0;
        int kalan;

        while (a !=0){
            kalan = a % 10;
            toplam += kalan;
            a /=10;
        }

        System.out.println("Basamaklar Toplamı:" + toplam);


    }
}