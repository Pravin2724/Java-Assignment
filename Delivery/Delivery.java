package Delivery;


import Restaurant.Restaurant;
import Restaurant.Order;

public class Delivery {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" RESTAURANT FOOD ORDER SYSTEM");
        System.out.println("========================================");

        Restaurant restaurant = new Restaurant(
                101, "Prince Restaurant", "Dindigul",
                "Pizza", 250,
                "Burger", 150,
                "Noodles", 200
        );
        restaurant.displayRestaurantDetails();
        System.out.println();

       
        Order order = new Order(1001, "Mohan", "Pizza", 3, 250);

       
        order.calculateOrderAmount();
        order.displayOrderDetails();
        System.out.println("========================================");

       
        System.out.println();
        System.out.println("Direct access restaurant.restId -> compiler error (private field)");
        System.out.println("Using getter restaurant.getRestId() -> " + restaurant.getRestId());

        System.out.println();
        System.out.println("Changing restaurant name using setter: restaurant.setName(\"Prince Food Corner\")");
        restaurant.setName("Prince Food Corner");
        System.out.println();
        restaurant.displayRestaurantDetails();
    }
}
