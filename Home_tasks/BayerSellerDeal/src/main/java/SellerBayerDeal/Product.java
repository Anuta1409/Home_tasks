package SellerBayerDeal;

/**
 * Created by Anna on 13.12.2015.
 */
public class Product {
    private String productTitle;
    private double productPrice;
    private int productQuantity;

    public String getProductTitle() {
        return productTitle;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
