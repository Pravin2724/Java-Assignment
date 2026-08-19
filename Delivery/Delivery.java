package Delivery;

// STEP 13 - Import classes from the Restaurant package
import Restaurant.Restaurant;
import Restaurant.Order;

public class Delivery {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" RESTAURANT FOOD ORDER SYSTEM");
        System.out.println("========================================");

        // STEP 14 - Create Restaurant object
        Restaurant restaurant = new Restaurant(
                101, "RKode Restaurant", "Chennai",
                "Pizza", 250,
                "Burger", 150,
                "Pasta", 200
        );
        restaurant.displayRestaurantDetails();
        System.out.println();

        // STEP 15 - Create Order object
        Order order = new Order(5001, "Arun", "Pizza", 2, 250);

        // STEP 16 - Calculate and display order
        order.calculateOrderAmount();
        order.displayOrderDetails();
        System.out.println("========================================");

        // STEP 17 - Demonstrate Encapsulation
        // Uncommenting the line below causes a COMPILER ERROR because
        // restId is private in Restaurant and cannot be accessed directly
        // from another class/package:
        //
        //     System.out.println(restaurant.restId);
        //     ERROR: restId has private access in Restaurant.Restaurant
        //
        // Instead, we must go through the public getter, which gives
        // controlled access to the private data. This is Encapsulation.
        System.out.println();
        System.out.println("Direct access restaurant.restId -> compiler error (private field)");
        System.out.println("Using getter restaurant.getRestId() -> " + restaurant.getRestId());

        // STEP 18 - Demonstrate Setter
        System.out.println();
        System.out.println("Changing restaurant name using setter: restaurant.setName(\"RKode Food Corner\")");
        restaurant.setName("RKode Food Corner");
        System.out.println();
        restaurant.displayRestaurantDetails();
    }
}
