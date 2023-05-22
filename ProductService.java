//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package main.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList();
    ProductDB db = new ProductDB();

    public ProductService() {
    }

    public void addProduct(Product p) {
        this.db.save(p);
    }

    public List<Product> getAllProducts() {
        return this.products;
    }

    public Product getProduct(String name) {
        Iterator var2 = this.products.iterator();

        Product p;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            p = (Product)var2.next();
        } while(!p.getName().equals(name));

        return p;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList();
        Iterator var4 = this.products.iterator();

        while(true) {
            Product p;
            String name;
            String type;
            String place;
            do {
                if (!var4.hasNext()) {
                    return prods;
                }

                p = (Product)var4.next();
                name = p.getName().toLowerCase();
                type = p.getType().toLowerCase();
                place = p.getPlace().toLowerCase();
            } while(!name.contains(str) && !type.contains(str) && !place.contains(str));

            prods.add(p);
        }
    }

    public List<Product> getProductWithPlace(String place) {
        String s = place.toLowerCase();
        List<Product> prods = new ArrayList();
        Iterator var4 = this.products.iterator();

        while(var4.hasNext()) {
            Product p = (Product)var4.next();
            String pla = p.getPlace().toLowerCase();
            if (pla.equals(s)) {
                prods.add(p);
            }
        }

        return prods;
    }

    public List<Product> checkWarranty(int wr) {
        List<Product> prods = new ArrayList();
        Iterator var3 = this.products.iterator();

        while(var3.hasNext()) {
            Product p = (Product)var3.next();
            if (p.getWarranty() >= wr) {
                prods.add(p);
            }
        }

        return prods;
    }
}
