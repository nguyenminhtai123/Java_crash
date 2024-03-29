package sort_class;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + price;
    }

//    @Override
//    public int compareTo(Product o) {
//        if(this.price < o.price) {
//            return -1;
//        }
//        if(this.price > o.price) {
//            return 1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareToIgnoreCase(o.name);
    }

}
