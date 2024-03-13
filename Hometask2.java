import java.util.Scanner;

public class Hometask2 {
//Составить процедуру,"рисующую"на экране горизонтальную линию из любого числа символов "*".

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите чиcло символов");
        int n = sc.nextInt();
        n--;
        String g = gorizontalLine10("*");
        System.out.println( g.repeat(n));
    }
    public static String gorizontalLine10(String a) {
        System.out.printf("%s",a);
        return  a;



    }

}
