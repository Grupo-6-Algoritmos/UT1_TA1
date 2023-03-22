package Ej2;

public class ArithmeticDemo {

    public static void main(String[] args) {
        //parte 1
        int result = 1 + 2;
        //  System.out.println(result);
        result -= 1;
        // System.out.println(result);
        result *= 2;
        // System.out.println(result);
        result /= 2;
        // System.out.println(result);
        result += 8;
        result %= 7;
        System.out.println(result);

        result = ((((3 - 1) * 2) / 2) + 8) % 7;
        System.out.println(result);
        //los resulados son los mismos
    }
}