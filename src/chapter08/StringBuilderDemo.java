package chapter08;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = new String("hi");
        System.out.println(s.hashCode());
        s = s + "!";
        System.out.println(s.hashCode());

        StringBuilder sb = new StringBuilder("hello world");
        sb = sb.append("!");
        System.out.println(sb.hashCode());


    }
}
