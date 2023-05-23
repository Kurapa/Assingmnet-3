package com.gnaneswar.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductService {
    @Autowired
    ProductDB db;

//    public void addProduct(Product p){
//        db.save(p);
//    }
//
    public List<Product> getAllProducts(){
        return db.findAll();
    }

    public Product getProduct(String name){
        return db.findByName(name);
    }


//    public List<Product> getProductWithText(String text) {
//
//         return db.findAllByText(text);
//    }

    public List<Product> getProductWithPlace(String place) {
               return db.findAllByPlace(place);
    }
//
//    public List<Product> checkWarranty(int wr){
//        List<Product> prods = new ArrayList<>();
//
//        for(Product p : products){
//            if(p.getWarranty()>=wr){
//                prods.add(p);
//            }
//        }
//        return prods;
//
//    }
}

