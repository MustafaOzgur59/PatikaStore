public abstract class Product {
    private String name;

    private String brandName;
    private double price;
    private int stockCount;
    private int uniqId;

    public Product(String name,String brandName, double price, int stockCount,int uniqId) {
        this.name = name;
        this.brandName = brandName;
        this.price = price;
        this.stockCount = stockCount;
        this.uniqId = uniqId;
    }

    public int getUniqId() {
        return uniqId;
    }

    public void setUniqId(int uniqId) {
        this.uniqId = uniqId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public abstract void printInfo();
}
