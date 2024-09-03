package academy.devdojo.maratonajava.javacore.ZZEconcorrencia.dominio;

// storeName:price:discountCode
public class Quote {
    private final String storeName;
    private final double price;
    private final Discount.Code discountCode;

    public Quote(String storeName, double price, Discount.Code discountCode) {
        this.storeName = storeName;
        this.price = price;
        this.discountCode = discountCode;
    }
}
