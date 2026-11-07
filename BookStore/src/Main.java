public class Main {
    static void main() {
        Book theLordOfTheRings = new Book("Властелин Колец", (short) 1500, (short) 1954, "Джон Рональд Руэл", "Толкин", (byte) 10);
        System.out.println(theLordOfTheRings.matches("Колец"));
        System.out.println(theLordOfTheRings.toString());
    }
}
