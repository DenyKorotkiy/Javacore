package goit.homework.task3.task32;


public class AdderTest {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int a = 5;
        int b = 7;
        adder.check(a, b);
        System.out.println(String.format("Result of check A and B: %b\nSum A and B: %d", adder.check(a, b), adder.add(a, b)));
    }
}
