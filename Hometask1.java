public class Hometask1 {
    //Составить процедуру,
    // "рисующую"на экране горизонтальную линию из 10 символов
    // "*"

    public static void main(String[] args) {
        gorizontalLine10("*");
       // gorizontalLine10("$");
    }

    public static void gorizontalLine10(String a) {
        System.out.printf("%s %s %s %s %s %s %s %s %s %s", a, a, a, a, a, a, a, a, a, a);
    }
}
