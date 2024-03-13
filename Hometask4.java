public class Hometask4 {
    //Напечатать числа ввиде следующей таблицы
    // :12..10
    // 12...10
    // 12...10
    // 12...10
    public static void main(String[] args) {
        printTable(1);
        System.out.println();
        printTable(1);
        System.out.println();
        printTable(1);
        System.out.println();
        printTable(1);
        System.out.println();


    }
    public static void printTable(int a){
        if(a<=10){
            System.out.printf("%d ", a );
            a++;
            printTable(a);
        }
    }
    }

