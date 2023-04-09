package src.class17;

public class MethodWithoutReturn {
    public static void main(String[] args) {
        MethodWithoutReturn obj = new MethodWithoutReturn();

        System.out.println(obj.add(10, 15));
        System.out.println(obj.reversString("well"));
    }

    int add(int a, int b) {
        int c;
        c = a + b;
        return c;

    }

    String reversString(String str) {
        StringBuilder stringBulder = new StringBuilder(str);
        stringBulder.reverse();
        str = stringBulder.toString();
        return str;

    }
}