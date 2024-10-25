package qaguru.java;

public class Main {

    public static void main(String[] args) {

    // Арифметические операторы + - / * % ++ --
        int a = 128;
        int b = 256;
        int c = 100_000_000;
        double d = 4.2;
        System.out.println("Сложить = " + (a + b));
        System.out.println("Вычесть = " + (a - b));
        System.out.println("Умножить = " + (a * b));
        System.out.println("Разделить = " + (b / a));
        System.out.println("Остаток от деления = " + (b % a));
        System.out.println("Инкремент   = " +  (b++));
        System.out.println("Декремент   = " +  (a--));
        System.out.println("Комбинации = " + (d + b));
    // Логические операторы
        boolean a1 = true;
        boolean b1 = false;
        System.out.println(a1&&b1);
        System.out.println(a1||b1);
        System.out.println(!b1);
    //Переполнение
        System.out.println("Переполнение = " +(c*b));

    }
}