package academy.devdojo.maratonajava.javacore.Nwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'P';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // Autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // Unboxing

        Integer intW2 = Integer.parseInt("3");
        int soma = intW2 + intP;
        System.out.println(soma);

        boolean verdadeiro = Boolean.parseBoolean("TrUe");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('B'));
        System.out.println(Character.isLowerCase('b'));
        System.out.println(Character.toUpperCase('w'));
        System.out.println(Character.toLowerCase('W'));
    }
}
