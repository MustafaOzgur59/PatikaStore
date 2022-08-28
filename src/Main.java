import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        PatikaStore store = new PatikaStore();
        store.getBrands().add(new Brand("Samsung",1));
        store.getBrands().add(new Brand("Lenovo",2));
        store.getBrands().add(new Brand("Apple",3));
        store.getBrands().add(new Brand("Huawei",4));
        store.getBrands().add(new Brand("Casper",5));
        store.getBrands().add(new Brand("Asus",6));
        store.getBrands().add(new Brand("HP",7));
        store.getBrands().add(new Brand("Xiaomi",8));
        store.getBrands().add(new Brand("Monster",9));
        store.addProductToBrand(new CellPhone("SAMSUNG GALAXY A51",3199.0,10,"Samsung"
                ,0,1,6,6.5,4000,128,32, "Black"));
        store.addProductToBrand(new CellPhone("iPhone 11 64 GB ",7379.0 ,10,"Apple"
                ,0,2,6,6.1,3046,64,5, "Blue"));
        store.addProductToBrand(new CellPhone("Redmi Note 10 Pro 8GB",4012.0,10,"Xiaomi"
                ,0,3,12,6.5,4000,128,35, "White"));
        store.sortBrands();

        store.addProductToBrand(new Notebook("HUAWEI Matebook 14",7000.0,10,"Huawei",4,0.0,
                16,512,14));
        store.addProductToBrand(new Notebook("LENOVO V14 IGL",3699.0,10,"Lenovo",5,0.0,
                8,1024,14));
        store.addProductToBrand(new Notebook("ASUS Tuf Gaming",8199.0,10,"Asus",6,0.0,
                32,2048,15.6));

        while(true){
            System.out.println("PatikaStore Product Management Panel");

            System.out.println("0 - Exit");
            System.out.println("1 - Notebook ");
            System.out.println("2 - Mobile Phone");
            System.out.println("3 - List Brands");


            System.out.print("Enter choice : ");
            int choice = input.nextInt();


            switch (choice){
                case 0:
                    System.exit(1);
                    break;
                case 1:
                    store.printNotebookChoice();
                    break;
                case 2:
                    store.printPhoneChoice();
                    break;
                case 3:
                    store.listBrands();
                    break;
            }
        }
    }
}
