import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Lütfen ürün fiyatını giriniz");
        float price=tara.nextInt();
        if(price>0&&price<=1000){
            System.out.println("KDV'li fiyat: "+(price*1.18)+"\nKDV oranı %18");
        }else if(price>1000){
            System.out.println("KDV'li fiyat: "+(price*1.08)+"\nKDV oranı %08");
        }else{
            System.out.println("Yanlış bir değer girdiniz");
        }

    }
}
