import java.util.Random;
import java.util.Scanner;

public class tasKagitMakas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int userPoint = 0 , prgPoint = 0 , round0 = 0;

        System.out.print("Kaçta bitmesini istediğinizi girin: ");
        int round = input.nextInt();

        while(round0 <= round){

            String[] items = {"Taş" , "Kağıt" , "Makas"};
            int prg = (int) (Math.random()*3);


            System.out.print("0) Taş \n1) Kağıt \n2) Makas \nITEM SEÇİNİZ : ");
            int kullanici = input.nextInt();
            System.out.println();

            while (kullanici<0 || kullanici>2){
                System.out.println("Yanlış seçim girdiniz. Lütfen tekrar deneyiniz ! ");
                System.out.print("Yeni seçiminiz : ");
                kullanici = input.nextInt();
            }

            System.out.println("Bilgisayar : " + items[prg]);
            System.out.println("Kullanıcı : " + items[kullanici]);

            if (prg == 0 && kullanici == 2 || prg == 1 && kullanici==0 || prg == 2 && kullanici==1) {
                System.out.println("BİLGİSAYAR KAZANDI ! ");
                System.out.println();
                prgPoint++;
                if (prgPoint == round){
                    System.out.println(round+ " serilik oyunu BİLGİSAYAR kazandı");
                    break;
                }
            }
            else if (kullanici == 0 && prg == 2 || kullanici == 1 && prg==0 || kullanici == 2 && prg==1){
                System.out.println("KULLANICI KAZANDI ! ");
                System.out.println();
                userPoint++;
                if (userPoint == round){
                    System.out.println(round+ " serilik oyunu KULLANICI kazandı");
                    break;
                }
            }
            else {
                System.out.println("BERABERE KALDINIZ ! ");
            }
            System.out.println("Kullanıcı : " + userPoint);
            System.out.println("Bilgisayar : " + prgPoint);
            System.out.println();
        }

    }
}
