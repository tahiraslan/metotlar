import java.awt.*;
import java.util.*;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
//Motodlar
        Main metodlar=new Main();//classtan nesne oluşturma

        metodlar.deneme();

        deneme2();
    }

    public void deneme(){//nesne oluşturma şartı var
        System.out.println("Bu deneme metodudur.");
    }

    public static void deneme2(){//nesne oluşturmadan direct çağırılabilir
        System.out.println("Classa bağlıyım direk gelirim");
    }

}