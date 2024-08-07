package OopsAssignment;

public class Product {
    private static int prodCounter = 100;
    
    private String productName;
    private String productCode;
    private double productPrice;
    private char categoryType;
    
    Product(String name, double price, char cat) {
        this.productCode = generateProductCode(cat);
        this.productName = name;
        this.categoryType = cat;
        this.productPrice = price;
    }

    Product(String name, double price) {
        this.productCode = generateProductCode('E');
        this.productName = name;
        this.categoryType = 'E';
        this.productPrice = price;
    }

    private static String generateProductCode(char cat) {
        String code = String.valueOf(prodCounter) + String.valueOf(cat) + "";
        prodCounter++;
        return code;
    }



    public static int getProdCounter() {
        return prodCounter;
    }



    public static void setProdCounter(int prodCounter) {
        Product.prodCounter = prodCounter;
    }



    public String getProductName() {
        return productName;
    }



    public void setProductName(String productName) {
        this.productName = productName;
    }



    public String getProductCode() {
        return productCode;
    }



    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }



    public double getProductPrice() {
        return productPrice;
    }



    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }



    public char getCategoryType() {
        return categoryType;
    }



    public void setCategoryType(char categoryType) {
        this.categoryType = categoryType;
    }

    public String getProductDetails() {
        return "Product: Code - " + this.productCode + ", Name - " + this.productName + ", Price - " + this.productPrice + ", Category - " + this.categoryType;
    }
}