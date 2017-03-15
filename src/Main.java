public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        int n = 11;
        System.out.println(n % 2 == 0 ? "число " + n + " четное" : "число " + n + " нечетное");
    }

    private static void task2() {
        double m,n;
        n = 10.5;
        m = 10.1;
        // выводим число из m и n, которое ближе к 10
        System.out.println((Math.abs(10.0 - m) < Math.abs(10.0 - n)) ? m : n);
    }

    private static void task3() {
        // решение квадратного уравнения на Java
        double a,b,c,d,x1,x2;
        a = 1;
        b = 4;
        c = 3;
        d = b*b - 4*a*c;
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2*a);
            x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        } else if (d == 0){
            x1 = (-b + Math.sqrt(d)) / (2*a);
            System.out.println("x = " + x1);
        } else {
            System.out.println("Действительных корней нет");
        }
    }

    private static void task4() {
        int iFrom, iTo, rFrom, rTo, rnd;
        rFrom = 5;
        rTo = 155;
        iFrom = 25;
        iTo = 100;
        rnd = rand(rFrom, rTo);
        if (rnd > iFrom && rnd < iTo) {
            System.out.println("Число " + rnd + " из отрезка [" + rFrom + ";" + rTo + "] содержится в интервале (" + iFrom + "," + iTo + ")");
        } else {
            System.out.println("Число " + rnd + " из отрезка [" + rFrom + ";" + rTo + "] не содержится в интервале (" + iFrom + "," + iTo + ")" );
        }
    }

    private static void task5() {
        int count, max, tmp, full;
        full = 0;
        max = 0;
        count = 4; // количество цифр
        for (int i = 0; i < count; i++) {
            tmp = rand(0,9);
            if (i == 0)
                max = tmp;
            if (tmp > max)
                max = tmp;
            full += (int)Math.pow(10.0, (double)i) * tmp;
        }
        System.out.println("В случайном " + count + "-значном числе " + full + " наибольшая цифра " + max);
    }

    private static void task6() {
        int a,b,c,tmp;
        a = 451;
        b = 3122;
        c = 2314;
        while (!(a <= b && b <= c)) {
            if (a > b) {
                tmp = a;
                a = b;
                b = tmp;
            }
            if (b > c) {
                tmp = b;
                b = c;
                c = tmp;
            }
        }
        System.out.println(a + ";" + b + ";" + c);
    }

    private static void task7() {
        int seconds, hours;
        seconds = 1249;
        hours = (int)(seconds/3600);
        System.out.println(seconds);
        System.out.println(hours > 0 ? hours : "менее часа");
    }

    private static void task8() {
        int counter;
        counter = 1000;
        System.out.println();
        while (counter < 9999) {
            counter += 3;
            if (counter < 9999) System.out.print(counter + " ");
            if (counter % 10 == 0)
                System.out.println();
        }
    }





    static int rand(int rFrom, int rTo) {
        return rFrom + (int)(Math.random() * ((rTo - rFrom) + 1));
    }
}
