package SRP;
import java.io.*;
import java.util.*;


public class main {
    public static void main(String[] args)
    {
        Customer customer1 = new Customer();
        customer1.setName("Yamika");
        customer1.setAddress("Pune");
        Order order1 = new Order();
        order1.setItemName("Pizza");
        order1.setQuantity(2);
        order1.setCustomer(customer1);

        order1.prepareOrder();

        BillCalculation billCalculation
                = new BillCalculation(order1);
        billCalculation.calculateBill();

        DeliveryApp deliveryApp = new DeliveryApp(order1);
        deliveryApp.delivery();
    }
}
