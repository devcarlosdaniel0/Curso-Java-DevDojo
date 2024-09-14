package academy.devdojo.maratonajava.javacore.ZZIjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectIsOfChildType() {
        Employee employeeDevelopeer = new Developer(1, "Java");
        if (employeeDevelopeer instanceof Developer) {
            Developer developer = (Developer) employeeDevelopeer;
            Assertions.assertEquals("Java", ((Developer) employeeDevelopeer).getMainLanguage());
        }

        if (employeeDevelopeer instanceof Developer developer) {
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }
}