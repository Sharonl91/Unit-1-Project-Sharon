import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your total bill: $");
        String bill = s.nextLine();
        double billNew = Double.parseDouble(bill);
        System.out.print("Enter the tip percentage (as a whole number, e.g., 18 for 18%): ");
        String tipPercent = s.nextLine();
        int tipPercentNew = Integer.parseInt(tipPercent);
        System.out.print("Enter the number of people in your party: ");
        String people = s.nextLine();
        int numPeople = Integer.parseInt(people);

        double tipTotal = (billNew * tipPercentNew) / 100.0;
        double total = (tipTotal + billNew);
        double tipPerPerson = (tipTotal / numPeople);
        double totalPerPerson = (total / numPeople);

        System.out.printf("The total tip amount is: $%.2f\n",tipTotal);
        System.out.printf("The total bill including tip is: $%.2f\n", total);
        System.out.printf("The tip per person is: $%.2f\n", tipPerPerson);
        System.out.printf("The total per person is: $%.2f\n", totalPerPerson);
    }
}
