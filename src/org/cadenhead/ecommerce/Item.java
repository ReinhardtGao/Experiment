package org.cadenhead.ecommerce;

public class Item implements Comparable{
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    private boolean noDiscount;

    Item(String idIn, String nameIN, String retailIn, String qIn, String disIn){
        id = idIn;
        name = nameIN;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(qIn);
        noDiscount = disIn.equals("TRUE");

        if (quantity > 400)
            price = retail * .50;
        else if (quantity > 200)
            price = retail * .60;
        else
            price = retail * .70;
        price = Math.floor( price * 100 + .5) / 100;
        if (noDiscount) {
            price = retail;
        }
    }

    public int compareTo(Object obj){
        Item temp = (Item) obj;
        if (this.price < temp.price){
            return 1;
        }else if (this.price > temp.price){
            return -1;
        }
        return 0;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getRetail(){
        return retail;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }
}
