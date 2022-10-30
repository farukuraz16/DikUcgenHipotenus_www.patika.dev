import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
      /*  Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
                𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
       */
        Scanner dat = new Scanner(System.in);
        System.out.println("dik kenar uzunluğu giriiz = ");
        double a= dat.nextInt();
        System.out.println("dik kenar uzunluğu giriiz = ");
        double b= dat.nextInt();
        double c= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs uzunluğu = " + c);
        System.out.println("Çevre = " + (a + b + c));
        System.out.println("Alan = " + ((a*b)/2));


    }
}
