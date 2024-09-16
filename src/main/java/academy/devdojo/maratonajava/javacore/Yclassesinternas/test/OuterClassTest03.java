package academy.devdojo.maratonajava.javacore.Yclassesinternas.test;

public class OuterClassTest03 {
    private String name = "Carlos";

    static class Nested {
        private String lastName = "Daniel";

        void print() {
            System.out.println(new OuterClassTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
