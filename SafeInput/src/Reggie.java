import java.util.Scanner;
public class Reggie {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String UCM = "";
        String SSN = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        UCM = SafeInput.getRegExString(in,"Enter your M number", "(M|m)\\d{5}");
        menuChoice = SafeInput.getRegExString(in,"Enter your menu choice", "[OoSsVvQq]");

        System.out.println("Your SSN is " + SSN + " Your M number is " + UCM + " Your menu choice is " + menuChoice);



    }
}
