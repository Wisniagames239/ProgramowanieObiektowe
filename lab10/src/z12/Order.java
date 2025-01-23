package z12;

import java.util.Arrays;

public class Order implements Comparable<Order> {
    String productName;
    int quantity;
    double unitPrice;
    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public int compareTo(Order o) {
        int result = -Double.compare(this.unitPrice, o.unitPrice);
        if(result != 0)
        {
            return result;
        }
        return Integer.compare(this.quantity, o.quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
class TestOrder{
    public static void main(String[] args) {
        Order[] orders = {new Order("AA", 4, 12.1),new Order("BB", 2, 15.3), new Order("CC", 4, 15.3), new Order("DD", 1, 10)};
        Arrays.sort(orders);
        System.out.println(Arrays.toString(orders));
    }
}