import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInteger = 0;
        favInteger = SafeInput.getInt(in, "What is your favorite integer?");
        int favDouble = 0;
        favDouble = SafeInput.getDouble(in, "What is your favorite decimal/double?");
        System.out.println("Your favorite integer is " + favInteger + " and your favorite double is " + favDouble);

    }
}
