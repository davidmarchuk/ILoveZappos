package david.myapplication.models;


import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("brandName")
    private String brandName;
    @SerializedName("thumbnailImageUrl")
    private String thumbnailImageUrl;
    @SerializedName("productId")
    private String productId;
    @SerializedName("originalPrice")
    private String originalPrice;
    @SerializedName("styleId")
    private String styleId;
    @SerializedName("colorId")
    private String colorId;
    @SerializedName("price")
    private String price;
    @SerializedName("percentOff")
    private String percentOff;
    @SerializedName("productUrl")
    private String productUrl;
    @SerializedName("productName")
    private String productName;

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }
    public void setThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }
    public String getStyleId() {
        return styleId;
    }
    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }
    public String getColorId() {
        return colorId;
    }
    public void setColorId(String colorId) {
        this.colorId = colorId;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getPercentOff() {
        return percentOff;
    }
    public void setPercentOff(String percentOff) {
        this.percentOff = percentOff;
    }
    public String getProductUrl() {
        return productUrl;
    }
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
}

