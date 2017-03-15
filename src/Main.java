public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    static void task1() {
        int n = 11;
        System.out.println(n % 2 == 0 ? "число " + n + " четное" : "число " + n + " нечетное");
    }

    static void task2() {
        double m,n;
        n = 10.5;
        m = 10.1;
        // выводим число из m и n, которое ближе к 10
        System.out.println((Math.abs(10.0 - m) < Math.abs(10.0 - n)) ? m : n);
    }

    static void task3() {
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

    static void task4() {

    }
}
