import java.util.ArrayList;
import java.util.HashSet;

public class Brand implements Comparable<Brand> {
    private String name;
    private ArrayList<Product> products;
    private HashSet<Integer> uniqIDs;
    private int id;

    public Brand(String name,  int id) {
        this.name = name;
        this.products = new ArrayList<Product>();
        this.id = id;
        this.uniqIDs = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addProduct(Product p){
        if (this.uniqIDs.contains(p.getUniqId())){
            System.out.println("A product with this id exists.");
        } else {
            this.products.add(p);
            this.uniqIDs.add(p.getUniqId());
        }
    }

    /*public void deleteProduct(int id){
        for (Product p : this.getProducts()){
            if (p.getUniqId() == id){
                this.getProducts().remove(p);
            }
        }
    }*/

    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.getName());
    }
}
