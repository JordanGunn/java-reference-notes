package ca.bcit.main.scratch;

import java.util.ArrayList;


enum InvoiceType{
    ENGINEER,
    PRODUCT,
    INVENTORY
}

public class Pricer {

    ArrayList<Item> invoice = new ArrayList<>();


    void runInvoiceCalc(Invoice invoice) {

        System.out.println();

        invoice.calculateTotalInvoicePrice();
    }

    public static void runInvoice(InvoiceType invoiceType, ArrayList<Item> items) {

        Pricer pricer = new Pricer();

        if (invoiceType.equals(InvoiceType.ENGINEER)) {
            pricer.runInvoiceCalc(new Invoice(items) {

                double calculateTotalInvoicePrice() {
                    double totalPrice = 0;

                    for (Item item : items) {
                        totalPrice += (int) ((item.getPrice() * item.getQuantity()) + (item.getPrice() * item.getQuantity()) * 0.5);
                    }

                    System.out.println(totalPrice);

                    return totalPrice;
                }
            });
        }


        if (invoiceType.equals(InvoiceType.PRODUCT)) {

            pricer.runInvoiceCalc(new Invoice(items) {

                double calculateTotalInvoicePrice() {
                    double totalPrice = 0;

                    for (Item item : items) {
                        totalPrice += (item.getPrice() * item.getQuantity()) + 100;
                    }

                    System.out.println(totalPrice);
                    return totalPrice;
                }
            });
        }

        if (invoiceType.equals(InvoiceType.INVENTORY)) {
            pricer.runInvoiceCalc(new Invoice(items) {
                public double calculateTotalInvoicePrice() {
                    double totalPrice = 0;

                    for (Item item : items) {
                        totalPrice += (item.getPrice() * item.getQuantity()) + (item.getQuantity() * 10);
                    }

                    System.out.println(totalPrice);
                    return totalPrice;
                }
            });
        }
    }
}


class Item {

    private int price;
    private int quantity;


    public Item(int price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice(){
        return price * quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

abstract class Invoice {

    ArrayList<Item> items;

    Invoice(ArrayList<Item> items) {
        this.items = items;
    }

    abstract double calculateTotalInvoicePrice();
}


class Demo {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, 2));
        items.add(new Item(1, 2));
        items.add(new Item(1, 2));
        items.add(new Item(1, 2));

        Pricer.runInvoice(InvoiceType.ENGINEER, items);

    }
}
