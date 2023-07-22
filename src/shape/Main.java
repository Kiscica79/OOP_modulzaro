package shape;

public class Main {

    public static void main(String[] args) {

        Shape kor = new Circle(5.3);
        System.out.println("A kör kerülete: " + kor.getPerimeter());
        System.out.println("A kör területe: " + kor.getArea());

        Shape negyzet = new Square(7.5);
        System.out.println("A négyzet kerülete: " + negyzet.getPerimeter());
        System.out.println("A négyzet területe: " + negyzet.getArea());

        Shape teglalap = new Square(10.5);
        System.out.println("A téglalap kerülete: " + teglalap.getPerimeter());
        System.out.println("A téglalap területe: " + teglalap.getArea());

    }
}
