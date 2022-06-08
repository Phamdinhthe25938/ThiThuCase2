package modal;

public class Product {
    String productCode;

    String productName;

    double priceProduct;

    int quantityProduct;

    String descriptionProduct;

    public Product() {

    }

    public Product(String productCode, String productName, double priceProduct, int quantityProduct, String descriptionProduct) {
        this.productCode = productCode;
        this.productName = productName;
        this.priceProduct = priceProduct;
        this.quantityProduct = quantityProduct;
        this.descriptionProduct = descriptionProduct;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    @Override
    public String toString() {
        return "productCode: " + productCode +
                ", productName :" + productName +
                ", priceProduct :" + priceProduct +
                ", quantityProduct :" + quantityProduct +
                ", descriptionProduct :" + descriptionProduct
                ;
    }
}
