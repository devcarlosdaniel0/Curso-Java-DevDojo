package academy.devdojo.maratonajava.javacore.Yclassesinternas.test;

public class OuterClassTest01 {
    private String name = "Giorno Giovanna";

    class Inner {
        private String name = "Luffy";
        public void printOuterClassAttributes() {
            System.out.println(name);
            System.out.println(OuterClassTest01.this.name);
        }
    }

    public static void main(String[] args) {
//        OuterClassTest01 outerClass = new OuterClassTest01();
//        OuterClassTest01.Inner inner2 = outerClass.new Inner();
//        inner2.printOuterClassAttributes();
        OuterClassTest01.Inner inner = new OuterClassTest01().new Inner();
        inner.printOuterClassAttributes();
    }
}
