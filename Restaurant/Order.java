package Restaurant;

public class Order {

    // STEP 7 - Private instance variables
    private int orderId;
    private String customerName;
    private String foodName;
    private int quantity;
    private double unitPrice;
    private double totalAmount;

    // STEP 8 - Parameterized constructor
    public Order(int orderId, String customerName, String foodName, int quantity, double unitPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodName = foodName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // STEP 9 - Calculate order amount
    public void calculateOrderAmount() {
        totalAmount = quantity * unitPrice;
    }

    // STEP 10 - Display order details
    public void displayOrderDetails() {
        System.out.println("ORDER DETAILS");
        System.out.println("----------------------------------------");
        System.out.println("Order ID        : " + orderId);
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Food Name       : " + foodName);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Unit Price      : Rs." + (int) unitPrice);
        System.out.println("Total Amount    : Rs." + (int) totalAmount);
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
