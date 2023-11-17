import java.util.Arrays;
import java.util.Scanner;

public class Main {

//Case Sensitive


    public static void main(String[] args) {
        String[] Flights = {"Uk", "France", "China","India","America"};

        System.out.println("Welcome to Tyler travels");
        System.out.println("These are our current flights" + Arrays.toString(Flights));
        System.out.println("Where would you like to travel?");


        int price_of_flight;
        Scanner sc = new Scanner(System.in);
        String Flight1 = sc.nextLine();

        int[] Prices = {100, 150, 200,120,300};




        if (check(Flights, Flight1)) {
            System.out.println(Flight1 + " is available");

            price_of_flight = check_price_of_flight(Flights, Flight1, Prices);

            System.out.println("the price of this flight is £" + price_of_flight);
            System.out.println("Would you like to buy it?");
            String Would_buy = sc.nextLine();
            switch (Would_buy) {
                case "yes":
                    System.out.println("Great!, your seat is a b6 and you board at 10pm");
                    main(args);
                    break;
                case "no":
                    System.out.println("Have a good day then");
                    main(args);
                    break;
                default:
                    main(args);
            }

        } else {
            System.out.println(Flight1 + " is not available");
            main(args);
        }
    }


    private static boolean check(String[] arr, String toCheckValue)
    {
        for (String element : arr) {

            if (element.equals(toCheckValue)) {
                return true;
            }

        }
        return false;
    }
    private static int check_price_of_flight(String[] arr,String flight_name, int[] Prices) {
        int i;
        i = Arrays.asList(arr).indexOf(flight_name);

        return Prices[i];
    }
}
