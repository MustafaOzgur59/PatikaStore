public class Notebook extends Product {
    private double discountRate;
    private int RAM;
    private int capacity;
    private double screenSize;

    public Notebook(String name, double price, int stockCount, String brandName, int uniqID,
                    double discountRate, int RAM, int capacity, double screenSize) {
        super(name,brandName, price, stockCount,uniqID);
        this.discountRate = discountRate;
        this.RAM = RAM;
        this.capacity = capacity;
        this.screenSize = screenSize;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void printInfo() {
        System.out.printf("\n| %-4s |%-25s| %-10s | %-10s | %-10s | %-10s | %-5s |\n",
                this.getUniqId(),this.getName(),this.getPrice(),this.getBrandName(),this.getCapacity()
                ,this.getScreenSize(),this.getRAM());
        System.out.println("----------------------------------------------------------------------------------------------");
    }
}
