import java.util.*;

public class PatikaStore {
    private ArrayList<Brand> brands;
    private static final Scanner input = new Scanner(System.in);


    public  PatikaStore(){
        brands = new ArrayList<Brand>();
    }

    public ArrayList<Brand> getBrands() {
        return brands;
    }

    public void setBrands(ArrayList<Brand> brands) {
        this.brands = brands;
    }

    public void addBrand(Brand b){
        this.brands.add(b);
        sortBrands();
    }

    public void sortBrands(){
        this.brands.sort(new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void addProductToBrand(Product p){

        for (Brand b : this.brands){
            if (b.getName().equals(p.getBrandName())){
                b.addProduct(p);
            }
        }
    }

    public void listBrands(){
        System.out.println("------------------");
        for (Brand b : this.brands){
            System.out.println(b.getName());
        }
        System.out.println("------------------\n");
    }

    public void printPhoneChoice(){
        System.out.print("\n\nPatikaStore Phone Management Panel! \n" +
                "0 - Return\n" +
                "1 - Add Phone\n" +
                "2 - Delete Phone\n" +
                "3 - Find a Phone by ID\n" +
                "4 - Find all Phones of a Brand\n" +
                "5 - List Phones \n" +
                "Your choice : ");

        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 0:
                break;
            case 1:
                addTelephone();
                break;
            case 2:
                deleteTelephone();
                break;
            case 3:
                System.out.print("Enter the ID : ");
                findTelephone(scanner.nextInt(), " ");
                break;
            case 4:
                System.out.print("Enter the name of the Brand : ");
                findTelephone(-1, scanner.next());
                break;
            default:
                this.listPhones();
                break;
        }
    }

    private void deleteTelephone() {
        System.out.print("Enter phone id to delete : ");
        int id = input.nextInt();
        for (Brand b : this.brands){
            for(Product p : b.getProducts()){
                if (p.getClass().getName().equals("CellPhone")){
                    if (p.getUniqId() == id){
                        b.getProducts().remove(p);
                    }
                }
            }
        }
    }

    private void addTelephone() {
        System.out.println("Enter information of the product in the order:");
        System.out.println("Name -- Brand Name -- price -- Discount Rate -- ID -- RAM -- Screen Size - Battery Size -- Storage Size -- Camere -- Color");
        String name = input.nextLine();
        String brandName = input.nextLine();
        double price = input.nextDouble();
        double discount = input.nextDouble();
        int uniqId = input.nextInt();
        int ram = input.nextInt();
        double screenSize = input.nextDouble();
        int batterySize = input.nextInt();
        int storageSize = input.nextInt();
        int camera = input.nextInt();
        String color = input.nextLine();
        String capitalizeBrand = brandName.substring(0,1).toUpperCase() + brandName.substring(1).toLowerCase();

        this.addProductToBrand(new CellPhone(name,price,10,capitalizeBrand,discount,uniqId,ram,screenSize
                ,batterySize,storageSize,camera,color));
    }

    public void findTelephone(int id, String brandName) {
        String capitalizeBrand = brandName.substring(0,1).toUpperCase() + brandName.substring(1).toLowerCase();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-4s |%-25s| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-6s | %-7s |","ID","Product Name","Price","Brand","Storage"
                ,"Screen","Camera","Battery","RAM","Color");
        System.out.print("\n--------------------------------------------------------------------------------------------------------------------------------------");

        if (id >= 0) {
            for (Brand b : this.brands) {
                for (Product p : b.getProducts()) {
                    if (!(p.getClass().getName().equals("CellPhone"))) continue;

                    if (p.getUniqId() == id) {
                        p.printInfo();
                    }
                }
            }
        }
        else {
            for (Brand b : this.brands) {
                if (b.getName().equals(capitalizeBrand)) {
                    for (Product p : b.getProducts()) {
                        if ((p.getClass().getName().equals("CellPhone"))){
                            p.printInfo();
                        }
                    }
                }
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public void listPhones(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-4s |%-25s| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-6s | %-7s |","ID","Product Name","Price","Brand","Storage"
                ,"Screen","Camera","Battery","RAM","Color");
        for (Brand b : this.brands){
            for (Product p : b.getProducts()){
                if (p.getClass().getName().equals("CellPhone")){
                    p.printInfo();

                }

            }
        }
    }

    public void listNoteBooks(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-4s |%-25s| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-6s | %-7s |","ID","Product Name","Price","Brand","Storage"
                ,"Screen","Camera","Battery","RAM","Color");
        for (Brand b : this.brands){
            for (Product p : b.getProducts()){
                if (p.getClass().getName().equals("Notebook")){
                    p.printInfo();
                }

            }
        }
    }

    public void printNotebookChoice() {
        System.out.print("\n\nPatikaStore Notebook Management Panel! \n" +
                "0 - Return\n" +
                "1 - Add Notebook\n" +
                "2 - Delete Notebook\n" +
                "3 - Find a Notebook by ID\n" +
                "4 - Find all Notebooks of a Brand\n" +
                "5 - List Notebooks \n" +
                "Your choice : ");

        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 0:
                break;
            case 1:
                addNotebook();
                break;
            case 2:
                deleteNotebook();
                break;
            case 3:
                System.out.print("Enter the ID : ");
                findNotebook(scanner.nextInt(), " ");
                break;
            case 4:
                System.out.print("Enter the name of the Brand : ");
                findNotebook(-1, scanner.next());
                break;
            default:
                this.listNoteBooks();
                break;
        }
    }

    public void addNotebook() {
        System.out.println("Enter information of the product in the order:");
        System.out.println("Name -- Brand Name -- price -- Discount Rate -- ID -- RAM -- Screen Size - -- Storage Size  ");
        String name = input.nextLine();
        String brandName = input.nextLine();
        double price = input.nextDouble();
        double discount = input.nextDouble();
        int uniqId = input.nextInt();
        int ram = input.nextInt();
        double screenSize = input.nextDouble();
        int storageSize = input.nextInt();
        String capitalizeBrand = brandName.substring(0,1).toUpperCase() + brandName.substring(1).toLowerCase();

        this.addProductToBrand(new Notebook(name,price,10,capitalizeBrand,uniqId ,
                discount,ram,storageSize,screenSize));
    }

    public void deleteNotebook() {
        System.out.print("\n\nEnter the id: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for (Brand b : this.getBrands()){
            for (Product p : b.getProducts()){
                if (p.getClass().getName().equals("Notebook")){
                    b.getProducts().remove(p);
                }
            }
        }
    }

    public void findNotebook(int id, String brandName) {
        String capitalizeBrand = brandName.substring(0,1).toUpperCase() + brandName.substring(1).toLowerCase();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("| %-4s |%-25s| %-10s | %-10s | %-10s | %-10s | %-5s |","ID","Product Name","Price","Brand","Storage"
                ,"Screen","RAM");
        System.out.print("\n----------------------------------------------------------------------------------------------");
        if (id >= 0) {
            for (Brand b : this.getBrands()) {
                for (Product p : b.getProducts()) {
                    if (p.getClass().getName().equals("Notebook")){
                        if (p.getUniqId() == id) {
                            p.printInfo();
                        }
                    }
                }
            }
        }
        else {
            for (Brand b : this.getBrands()) {
                if (b.getName().equals(capitalizeBrand)) {
                    for (Product p : b.getProducts()) {
                        if (p.getClass().getName().equals("Notebook")) {
                            p.printInfo();
                        }
                    }
                }
            }
        }
    }

}
