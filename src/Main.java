import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Lütfen ürün fiyatını giriniz");
        float price=tara.nextInt();

        if(price>0&&price<=1000){
            float a= (float) (price*1.18);
            float d=a-price;
            System.out.println("KDV'li fiyat: "+a+"\nKDV oranı %18"+"\nKDV fiyat farkı: "+d+" TL");
        }else if(price>1000){
            float b= (float) (price*1.08);
            float c=b-price;
            System.out.println("KDV'li fiyat: "+b+"\nKDV oranı %08"+ "\nKDV fiyat farkı: "+c+" TL");
        }else{
            System.out.println("Yanlış bir değer girdiniz");
        }

    }
}
