package com.example.fun;

public class CartItemModel {

    public static final int CART_ITEM = 0;
    public static final int TOTAL_AMOUNG = 1;


    private int type;
    ///////// cart item
    private int productImage;
    private String productTile;
    private int freeCoupens;
    private String productPrice;
    private String cuttePrice;
    private int productQuantity;
    private int offersApplied;
    private int coupensAplied;
    /////// card total
    private String totalItems;
    private String totalItemPrice;
    private String deliveryPrice;
    private String savedAmount;
    private String totalAmount;

    public CartItemModel(int type, int productImage, String productTile, int freeCoupens, String productPrice, String cuttePrice, int productQuantity, int offersApplied, int coupensAplied) {
        this.type = type;
        this.productImage = productImage;
        this.productTile = productTile;
        this.freeCoupens = freeCoupens;
        this.productPrice = productPrice;
        this.cuttePrice = cuttePrice;
        this.productQuantity = productQuantity;
        this.offersApplied = offersApplied;
        this.coupensAplied = coupensAplied;
    }

    public CartItemModel(int type, String totalItems, String totalItemPrice, String deliveryPrice, String totalAmount, String savedAmount) {
        this.type = type;
        this.totalItems = totalItems;
        this.totalItemPrice = totalItemPrice;
        this.deliveryPrice = deliveryPrice;
        this.savedAmount = savedAmount;
        this.totalAmount = totalAmount;


    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductTile() {
        return productTile;
    }

    public void setProductTile(String productTile) {
        this.productTile = productTile;
    }

    public int getFreeCoupens() {
        return freeCoupens;
    }

    public void setFreeCoupens(int freeCoupens) {
        this.freeCoupens = freeCoupens;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getCuttePrice() {
        return cuttePrice;
    }

    public void setCuttePrice(String cuttePrice) {
        this.cuttePrice = cuttePrice;
    }
    ///////// cart item

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getOffersApplied() {
        return offersApplied;
    }

    public void setOffersApplied(int offersApplied) {
        this.offersApplied = offersApplied;
    }

    public int getCoupensAplied() {
        return coupensAplied;
    }

    public void setCoupensAplied(int coupensAplied) {
        this.coupensAplied = coupensAplied;
    }

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public String getTotalItemPrice() {
        return totalItemPrice;
    }

    public void setTotalItemPrice(String totalItemPrice) {
        this.totalItemPrice = totalItemPrice;
    }

    public String getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(String deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public String getSavedAmount() {
        return savedAmount;
    }

    public void setSavedAmount(String savedAmount) {
        this.savedAmount = savedAmount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
    /////// card total

}
