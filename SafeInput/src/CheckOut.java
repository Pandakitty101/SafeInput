import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        double additionalItem = 0;
        String anotherItem;
        boolean again = false;

        do {
            additionalItem = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.5, 9.99);
            System.out.println(additionalItem);
            totalPrice = additionalItem + totalPrice;
            anotherItem = SafeInput.getYNConfirm(in, "Do you have another item?");
            if (anotherItem.equalsIgnoreCase("y")) {
                again = true;
            } else if (anotherItem.equalsIgnoreCase("n")) {
                again = false;
            }
        } while (again);
        System.out.printf("Your total price is " + "%2.2f", totalPrice);
    }

}

