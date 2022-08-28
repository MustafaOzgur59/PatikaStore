public class CellPhone extends Product{
    private double discountRate;

    private int ram;
    private double screenSize;
    private int batterySize;
    private int capacity;
    private int camera;
    private String color;

    public CellPhone(String name, double price, int stockCount,  String brandName, double discountRate, int uniqID, int ram
            , double screenSize, int batterySize, int capacity, int camera, String color) {
        super(name,brandName, price, stockCount,uniqID);
        this.discountRate = discountRate;
        this.ram = ram;
        this.screenSize = screenSize;
        this.batterySize = batterySize;
        this.capacity = capacity;
        this.camera = camera;
        this.color = color;
    }
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public void printInfo() {
        System.out.printf("\n| %-4s |%-25s| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-6s | %-7s |\n",
                this.getUniqId(),this.getName(),this.getPrice(),this.getBrandName(),this.getCapacity()
                ,this.getScreenSize(),this.getCamera(),this.getBatterySize(),this.getRam(),this.getColor());
    }
}
