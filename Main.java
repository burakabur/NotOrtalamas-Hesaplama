import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenleri oluştur.
        int matematik,fizik,kimya,turkce,tarih,muzik;

        //scanner sınıfımızı tamamladık.
        Scanner inp=new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        matematik =inp.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik =inp.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya =inp.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce =inp.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih =inp.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik =inp.nextInt();

        int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalama Notunuz : " + sonuc);

        boolean kosul1 = sonuc>=60;
        boolean kosul2 = sonuc<=60;
        boolean gectikaldi = kosul1 && kosul2;

        String durum = (gectikaldi ? "Sınıfı Geçti" : "Sınıfta Kaldı");

        System.out.println(durum);
    }
    }
