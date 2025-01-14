import entities.enums.OrderStatus;
import orders.Orders;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Orders Order = new Orders(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(Order);

        OrderStatus os1 = OrderStatus.DEVILERED;

        OrderStatus os2 = OrderStatus.valueOf("DEVILERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}