package academy.devdojo.maratonajava.javacore.Rresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundleEN = ResourceBundle.getBundle("messages", new Locale("en", "GB"));
        System.out.println(bundleEN.getString("hello"));
        System.out.println(bundleEN.getString("good.morning"));
        System.out.println(bundleEN.getString("hi"));

        ResourceBundle bundleBR = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundleBR.getString("hello"));
        System.out.println(bundleBR.getString("good.morning"));
        System.out.println(bundleBR.getString("hi"));
    }
}
