import java.awt.*;
import java.util.*;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
//Motodlar
        Main metodlar=new Main();//classtan nesne oluşturma

        metodlar.deneme();

        System.out.println(hesap(12));

        deneme2();
        toplama(18.7); //18.7+5=23.7 ** 23.7
    }
    public static double hesap(double sayi){//deger alan değer döndüren
        double sonuc=sayi+18.5;

        return sonuc;
    }
    public void deneme(){//nesne oluşturma şartı var
        System.out.println("Bu deneme metodudur.");
    }

    public static void deneme2(){//nesne oluşturmadan direct çağırılabilir
        System.out.println("Classa bağlıyım direk gelirim");
    }
    // deger alan deger dödürmeyen metot
    public static void toplama(double sayi1){
        double sonuc=sayi1+5;
        System.out.println(sonuc);

    }

}