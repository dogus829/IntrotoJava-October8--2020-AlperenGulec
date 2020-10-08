
public class MilestoKilometerChart {

    public static void main(String[] args) {

        int miles = 0;

        while (miles <= 10) {
            double kilometer = miles * 1.609;
            System.out.println(miles + " miles" + " equals to " + kilometer + " kilometers.");
            miles++;
        }

    }
}