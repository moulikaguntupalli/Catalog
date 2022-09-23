package com.gmoulika.category.model;

import com.moulika.category.model.Sale;

import java.util.ArrayList;
import java.util.List;

public class CategoryApplication {
    public static void main(String[] args) {

        List<Sale> s=new ArrayList<Sale>();
        s.add(new Sale(1,2,3,3,2));
        s.add(new Sale(2,2,3,4,5));
        List<Integer> amount = new ArrayList<Integer>();
        for(Sale sale: s){
            if(sale.getAmount()>200){
                amount.add((int) sale.getAmount());
            }
        }
        System.out.println(s);
    }
}
