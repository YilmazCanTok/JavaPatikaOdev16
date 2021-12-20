
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("=======Gelişmiş Hesap Makinesi=======");
        System.out.println("----------------------------------------------------");
        String menü = ("1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi\n"
                + "5. Üslü Sayı Hesaplama\n"
                + "6. Faktoriyel hesaplama\n"
                + "7. Mod Alma\n"
                + "8. Diktörtgen Alan ve çevre Hesabı\n"
                + "9. Çıkış Yapma");
        int işlem;
        System.out.println(menü);
        do {
            System.out.print("Lütfen bir işlem seçiniz :");
            işlem = scanner.nextInt();
            switch (işlem) {
                case 1:
                    toplama();
                    break;
                case 2:
                    çıkarma();
                    break;
                case 3:
                    çarpma();
                    break;
                case 4:
                    bölme();
                    break;
                case 5:
                    üslüsayıhesaplama();
                    break;
                case 6:
                    faktöriyelhesabı();
                    break;
                case 7:
                    modalma();
                    break;
                case 8:
                    dikdörtgen();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (işlem != 0);
        System.out.println("----------------------------------------------------");
        System.out.println("****************************************************");
    }

    public static void toplama() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplamak İstediğiniz Sayı Adedini Giriniz : ");
        int number = scanner.nextInt();
        double toplam = 0;

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            double sayi = scanner.nextDouble();
            toplam = toplam + sayi;
        }
        System.out.println("Sayıların Toplamı : " + toplam);
    }

    public static void çıkarma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çıkarmak İstediğiniz Sayı Adedini Giriniz : ");
        int number = scanner.nextInt();
        double fark = 0;
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            double sayi = scanner.nextDouble();
            fark = fark - sayi;
        }
        System.out.println("Sayıların Toplamı : " + fark);
    }

    public static void çarpma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çarpmak İstediğiniz Sayı Adedini Giriniz : ");
        int number = scanner.nextInt();
        double çarpım = 1;
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            double sayi = scanner.nextDouble();
            çarpım = çarpım * sayi;
        }
        System.out.println("Sayıların Toplamı : " + çarpım);

    }

    public static void bölme() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bölünen Sayı Değerini Giriniz : ");
        double bolunen = scanner.nextDouble();
        System.out.print("Bölen Sayının Değerini Giriniz : ");
        double bolen = scanner.nextDouble();
        double sonuç = bolunen / bolen;
        System.out.println("Sonuç = " + sonuç);
    }

    public static void üslüsayıhesaplama() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz : ");
        int taban = scanner.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int üs = scanner.nextInt();
        int sonuç = 1;
        if (üs == 0) {
            sonuç = 1;
            System.out.println("Sonuç = " + sonuç);
        } else if (sonuç > 0) {
            for (int i = 1; i <= üs; i++) {
                sonuç = sonuç * taban;
            }
            System.out.println("Sonuç = " + sonuç);
        } else {
            for (int i = 1; i <= üs; i++) {
                sonuç = sonuç / taban;
            }
            System.out.println("Sonuç = " + sonuç);
        }
    }

    public static void faktöriyelhesabı() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Faktöriyelinin Alınmasını İstediğiniz Değeri Yazınız : ");
        int sayı = scanner.nextInt();
        int faktöriyel = 1;
        if (sayı == 0 || sayı == 1) {
            faktöriyel = 1;
        } else if (sayı < 0) {
            System.out.println("Geçersiz Sayı Girildi. lütfen pozitif bir sayı giriniz...");
        } else {
            for (int i = 1; i <= sayı; i++) {
                faktöriyel = faktöriyel * i;
            }
            System.out.println("Faktöriyel Değeri : " + faktöriyel);
        }
    }

    public static void modalma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Modunu Alacağınız Sayıyı Giriniz : ");
        int sayı = scanner.nextInt();
        System.out.print("Alacağınız Mod Değerini Giriniz : ");
        int mod = scanner.nextInt();
        int sonuç = sayı % mod;
        System.out.println(sayı + " sayısının " + mod + "sayısından çıkan modu : " + sonuç);
    }

    public static void dikdörtgen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin 1. kenar uzunluğunu giriniz : ");
        double bkenar = scanner.nextDouble();
        System.out.print("Dikdörtgenin 2. kenar uzunluğunu giriniz : ");
        double ikenar = scanner.nextDouble();
        double alan = bkenar * ikenar;
        double çevre = (bkenar + ikenar) * 2;
        System.out.println("Dikdörtgenin Alanı : " + alan);
        System.out.println("Dikdörtgenin Çevresi : " + çevre);
    }

}
