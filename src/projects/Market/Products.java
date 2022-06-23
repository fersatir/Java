package projects.Market;

public class Products {

    String productsNumber;
    String productName;
    String productPrice;
    String productWeight;

    @Override
    public String toString() {
        return
                "Product Number='" + productsNumber + '\'' +
                ", Product Name='" + productName + '\'' +
                ", Product Price='" + productPrice + '\''+
                ", Product Weight='" + productWeight + '\'';
    }

    public void setProductsNumber(String productsNumber) {
        this.productsNumber = productsNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductsNumber() {
        return productsNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public Products(String productsNumber, String productName, String productPrice) {
        this.productsNumber = productsNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Products(String productsNumber, String productWeight) {
        this.productsNumber = productsNumber;
        this.productWeight = productWeight;
    }

}
