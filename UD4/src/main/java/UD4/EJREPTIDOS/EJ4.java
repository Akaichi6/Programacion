package UD4.EJREPTIDOS;

public class EJ4 {
    public static void main(String[] args) {
        int a=12;
        int b=8;
        int c=6;
        System.out.println(a+" "+b+ " " + c);
        a=c;
        System.out.println(a+" "+b+ " " + c);
        c += b;
        System.out.println(a+" "+b+ " " + c);
        a= b + c;
        System.out.println(a+" "+b+ " " + c);
        a++;
        b++;
        System.out.println(a+" "+b+ " " + c);
        c = a++ + ++b;
        System.out.println(a+" "+b+ " " + c);

    }
}
