import java.util.Scanner;

public class yil {
    public static void main(String[] args) {
        System.out.println("Yılı giriniz");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int fh = year % 400;
        int four = year % 4;
        int hund=year%100;
       if ((four==0 || fh==0)&& hund!=0){
           System.out.println(year + " artık yıldır");
       }else{
           System.out.println(year + " artık yıl değildir");
       }
    }
    }
