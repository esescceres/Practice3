import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
      //Değişkenleri oluşturma
      int a, b;
      double c;

      // Kullanıcıdan verilerin alınması
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz: ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz:");
        b = girdi.nextInt();

                c = Math.sqrt((a*a) + (b*b));
                System.out.println("Hipotenüs : "+c);
    }
}