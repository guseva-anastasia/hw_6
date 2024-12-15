package guru_qa_hw;

public class Main {
    public static void main(String[] args) {
        // Целочисленные типы
        byte aByte = 0; // 1 byte or 8 bit -128 + 127
        short aShort = 0; // 2 byte or 16 bit -(2^15) ... (2^15)-1 или с -32768 по 32767
        int aInt = 0; // 4 byte or 32 bit  -(2^32) .. (2^32)-1 или с -2147483648 по 2147483647
        Integer intWrapper = 0;
        long aLong = 0L; // 8 byte or 64 bit -(2^63) .. (2^63)-1 или с -9223372036854775808 по 9223372036854775807
        // Типы с плавающей точкой
        float aFloat = 0.0F; // 4 byte or 32 bit от -3.4*10^38 до 3.4*10^38
        double aDouble = 0.0; // 8 byte or 64 bit ±4.9*10^-324 до ±1.7976931348623157*10^308

        int a = 104;
        int b = 21;

        System.out.println("Арифметические операции над двумя примитивами типа int");
        System.out.println("Сложение: " + a + "+" + b + "=" + (a+b));
        System.out.println("Вычитание: " + a + "-" + b + "=" + (a-b));
        System.out.println("Умножение: " + a + "*" + b + "=" + (a*b));
        System.out.println("Деление: " + a + "/" + b + "=" + (a/b));

        double c = 3.5;
        double d = 3.5;

        System.out.println("Арифметические операции над int и double в одном выражении");
        System.out.println("Сложение: " + b + "+" + c + "=" + (b+c));
        System.out.println("Вычитание: " + b + "-" + c + "=" + (b-c));
        System.out.println("Умножение: " + b + "*" + c + "=" + (b*c));
        System.out.println("Деление: " + b + "/" + c + "=" + (b/c));
        System.out.println("Деление без остатка: остаток от деления "+ b + " на " + c + " равен " + (b%c));
        System.out.println("Деление с остатком: остаток от деления "+ a + " на " + b + " равен " + (a%b));

        System.out.println("Логические операции");
        System.out.println("Больше: " + a + ">" + b + " " + (a>b));
        System.out.println("Меньше: " + c + "<" + b + " " + (c<b));
        System.out.println("Больше или равно: " + a + ">=" + b + " " + (a>=b));
        System.out.println("Меньше или равно: " + c + "<=" + d + " " + (c<=b));
        System.out.println("Равенство: " + c + "=" + d + " " + (c==d));
        System.out.println("Неравенство: " + a + "!=" + d + " " + (a!=d));

        int e = Integer.MIN_VALUE;
        int f = Integer.MAX_VALUE;
        double g = Double.MIN_VALUE ;
        double h = Double.MAX_VALUE ;
        byte i = Byte.MIN_VALUE;
        byte j = Byte.MAX_VALUE;
        short k = Short.MIN_VALUE;
        short l = Short.MAX_VALUE;
        long m = Long.MIN_VALUE;
        long n = Long.MAX_VALUE;
        float o = Float.MIN_VALUE;
        float p = Float.MAX_VALUE;

        System.out.println("Минимальные и максимальные значения");
        System.out.println("integer с "+e+" по "+f);
        System.out.println("double с "+g+" по "+h);
        System.out.println("byte с "+i+" по "+j);
        System.out.println("short с "+k+" по "+l);
        System.out.println("long с "+m+" по "+n);
        System.out.println("float с "+o+" по "+p);

        System.out.println("Получение переполнения на примере integer " + f + " + " + 1 + " = " + (f+1));

        int age = 56;
        String sex = "male";

        if (age>=55 && sex=="female")
        {
            System.out.println("Пора на пенсию");
            System.out.println("Песок сыпется");
        }
        else {
            if (age>=60 && sex=="male")
            {
                System.out.println("Пора на пенсию");
                System.out.println("Песок сыпется");
            }
            else
                System.out.println("Ещё в самом рассвете сил");
        }
    }
}
