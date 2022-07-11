public class CtoFTableDisplay {
    public static void main(String[] args) {

        for(int x = -100; x <= 100; x++)
        {
            System.out.printf("%-10d%-3.0f\n", x, CtoF(x));
        }
    }
    public static double CtoF(double celsius)
    {
        double fahrenheit = 0;

        fahrenheit = (celsius * 9/5) + 32;

        return fahrenheit;


    }
}
