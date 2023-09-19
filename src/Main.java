import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double tipTotal;
        double total;
        double tipEach;
        double totalEach;

        System.out.print("Enter your total bill: ");
        String bill = s.nextLine();
        double billNew = Double.parseDouble(bill);
        System.out.print("Enter the tip percentage (as a whole number): ");
        String tipPercent = s.nextLine();
        int tipPercentNew = Integer.parseInt(tipPercent);
        System.out.print("Enter the number of people in your party: ");
        String people = s.nextLine();
        int peopleNew = Integer.parseInt(people);

        tipTotal = (Math.round(billNew * tipPercentNew));
        tipTotal /= 100;
        total = (Math.round(tipTotal + billNew));
        total = (Math.round(tipTotal + billNew));
        tipEach = (Math.round(tipTotal / peopleNew));
        tipEach = (Math.round(tipTotal / peopleNew));
        totalEach = (Math.round(total / peopleNew);
        totalEach = (Math.round(total / peopleNew);
        System.out.println("The total tip amount is: " +tipTotal);
        System.out.println("The total bill including tip is: " +total);
        System.out.println("The tip per person is: " +tipEach);
        System.out.println("The total per person is: " +totalEach);
    }
}
