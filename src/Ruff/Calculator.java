package Ruff;

public class Calculator {
    public static int Add(int a, int b) {
        int d = a + b;
        return d;
    }

    public String sss(String s) {
        return s;
    }
}

class runner {
    public static void main(String[] args) {
        int a = Calculator.Add(1, 2);
        System.out.println(a);

        Calculator c = new Calculator();
       String ss= c.sss("i have returned string!");
        System.out.println(ss);
    }
}
