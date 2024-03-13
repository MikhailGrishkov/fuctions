import java.util.Scanner;

public class Hometask3 {
    //.3.Даны стороны двух треугольников.Найти сумму их периметров и сумму их площадей.
    // (Определить процедуру для расчета периметра и площади треугольника по его сторонам.)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длины стороны  1-го треугольника");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите длины сторон  2-го треугольника");
        int a1 = sc1.nextInt();
        int b1 = sc1.nextInt();
        int c1 = sc1.nextInt();

        int p = perimeter(a, b, c);
        System.out.println("P = " + p);
        int p1 = perimeter(a1, b1, c1);
        System.out.println("P1 = " + p1);

        double s = square(p, a, b, c);
        System.out.println("S = " + square(p, a, b, c));
        double s1 = square(p1, a1, b1, c1);
        System.out.println("S1 = " + square(p1, a1, b1, c1));

        System.out.println("Сумма периметров = " + (p + p1));
        System.out.println("Сумма площадей = " + (s + s1));
    }

    public static int perimeter(int a, int b, int c) {
        return a + b + c;
    }

    public static double square(int p, int a, int b, int c) {
        int pp = p / 2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}

