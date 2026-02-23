package SS10.ex6;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + " - " + price);
    }
}

public class ex6 {
    public static void main(String[] args) {

        Product[] products = {
                new Product("Laptop", 1500),
                new Product("Mouse", 20),
                new Product("Keyboard", 50),
                new Product("Monitor", 300)
        };
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].price > products[j].price) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }

        System.out.println("Sắp xếp theo giá tăng dần:");
        for (Product p : products) {
            p.display();
        }
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].name.compareTo(products[j].name) > 0) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }

        System.out.println("\nSắp xếp theo tên A-Z:");
        for (Product p : products) {
            p.display();
        }
    }
}