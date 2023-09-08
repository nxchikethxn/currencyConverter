import java.util.Scanner;

public class currencyConverter {

    public static void main(String[] args) {

        // pick input of choice
        System.out.println("1 Dollar");
        System.out.println("2 Rupee");
        System.out.println("3 Euro");
        System.out.println("4 Yuan");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose your currency");

            int choice = sc.nextInt();
            System.out.println("Enter the amount");
            double amount = sc.nextDouble();
            // convert the amount
            switch (choice) {
                case 1:
                    dollarTo(amount);
                    break;
                case 2:
                    rupeeTo(amount);
                    break;
                case 3:
                    euroTo(amount);
                    break;
                case 4:
                    yuanTo(amount);
                break;
                default:
                    System. out.println("Invalid choice. Please select again.");
            }
        }
    }

    public static void dollarTo(double dollar) {

        System.out.println("1 US Dollar = " + 83.24 + " Rupees");
        System.out.println();
        System.out.println(dollar + " US Dollars = " + (dollar * 83.24) + " Rupees");
        System.out.println();

        System.out.println("1 US Dollar = " + 0.93 + " Euro");
        System.out.println();
        System.out.println(dollar + " US Dollars = " + (dollar * 0.93) + " Euros");
        System.out.println();

        System.out.println("1 US Dollar = " + 7.33 + " Chinese Yuan");
        System.out.println();
        System.out.println(dollar + " US Dollars = " + (dollar * 7.33) + " Chinese Yuan");
        System.out.println();

    }

    public static void rupeeTo(double rupee) {

        System.out.println("1 Rupee = " + 0.012 + " US Dollars");
        System.out.println();
        System.out.println(rupee + " Rupees = " + (rupee * 0.012) + " US Dollars");
        System.out.println();

        System.out.println("1 Rupee = " + 0.011 + " Euros");
        System.out.println();
        System.out.println(rupee + " Rupees = " + (rupee * 0.011) + " Euros");
        System.out.println();

        System.out.println("1 Rupee = " + 0.088 + " Chinese Yuan");
        System.out.println();
        System.out.println(rupee + " Rupees = " + (rupee * 0.088) + " Chinese Yuan");
        System.out.println();

    }

    public static void euroTo(double euro) {

        System.out.println("1 Euro = " + 1.07 + " US Dollars");
        System.out.println();
        System.out.println(euro + " Euros = " + (euro * 83.24) + " US Dollars");
        System.out.println();

        System.out.println("1 Euro = " + 89.03 + " Rupees");
        System.out.println();
        System.out.println(euro + " Euros = " + (euro * 83.24) + " Rupees");
        System.out.println();

        System.out.println("1 Euros = " + 7.84 + " Chinese Yuan");
        System.out.println();
        System.out.println(euro + " Euros = " + (euro * 7.84) + " Chinese Yuan");
        System.out.println();

    }

    public static void yuanTo(double yuan) {

        System.out.println("1 Chinese Yuan = " + 0.14 + " US Dollars");
        System.out.println();
        System.out.println(yuan + " Chinese Yuan = " + (yuan * 0.14) + " US Dollars");
        System.out.println();

        System.out.println("1 Chinese Yuan = " + 11.36 + " Rupees");
        System.out.println();
        System.out.println(yuan + " Chinese Yuan = " + (yuan * 11.36) + " Rupees");
        System.out.println();

        System.out.println("1 Chinese Yuan = " + 0.13 + " Euros");
        System.out.println();
        System.out.println(yuan + " Chinese Yuan = " + (yuan * 0.13) + " Euros");
        System.out.println();

    }

}