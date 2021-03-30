import java.util.Scanner;
import static java.lang.Math.*;
public class Budget{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double total = 0;
		System.out.println("Please enter your monthly income: ");
		double income = scan.nextDouble();
		System.out.println("Please enter the amount of money paid for rent this month: ");
		double rent = scan.nextDouble();
		total += rent;
		System.out.println("Please enter the amount paid for food and groceries this month: ");
		double groceries = scan.nextDouble();
		total += groceries;
		System.out.println("Please enter the amount paid for daily expenses this month: ");
		double daily = scan.nextDouble();
		total += daily;
		System.out.println("Please enter the amount paid for emergency expenses this month: ");
		double emergency = scan.nextDouble();
		total += emergency;
		System.out.println("Please enter the amount paid for household expenses this month: ");
		double house = scan.nextDouble();
		total += house;
		System.out.println("Please enter the amount paid for clothing expenses this month: ");
		double clothing = scan.nextDouble();
		total += clothing;
		System.out.println("Please enter the amount paid for subscription costs this month: ");
		double subscription = scan.nextDouble();
		total += subscription;
		System.out.println("Please enter the amount paid for guest expenses this month: ");
		double guests = scan.nextDouble();
		total += guests;
		System.out.println("Please enter the amount paid for travel expenses this month: ");
		double travel = scan.nextDouble();
		total += travel;
		System.out.println("Please enter the amount paid for program memberships this month: ");
		double memberships = scan.nextDouble();
		total += memberships;
		System.out.println("Please enter the amount paid for medical prescriptions this month: ");
		double prescription = scan.nextDouble();
		total += prescription;
		System.out.println("Please enter the amount paid for pet care this month: ");
		double pet = scan.nextDouble();
		total += pet;
		System.out.println("Please enter the amount paid for back account fees: ");
		double bank = scan.nextDouble();
		total += bank;
		System.out.println("Please enter the amount paid for parking fees: ");
		double parking = scan.nextDouble();
		total += parking;
		System.out.println("Please enter the amount paid for car registration fees: ");
		double car = scan.nextDouble();
		total += car;
		System.out.println("Please enter the amount paid for entertainment expenses: ");
		double entertainment = scan.nextDouble();
		total += entertainment;
		System.out.println("Please enter the amount paid for birthday costs: ");
		double birthday = scan.nextDouble();
		total += birthday;
		System.out.println("Please enter the amount paid for holiday expenses: ");
		double holiday = scan.nextDouble();
		total += holiday;
		System.out.println("Please enter the amount paid for charity this month: ");
		double charity = scan.nextDouble();
		total += charity;
		System.out.println("Please enter the amount paid for labor union fees this month: ");
		double labor = scan.nextDouble();
		total += labor;
		if((income - total) > 0){
			double leftover = income - total;
			System.out.print("You still have $");
			System.out.format("%.2f",leftover);
			System.out.println(" leftover for this month!");
		}else if((income - total) < 0){
			double overspent = abs(income-total);
			System.out.print("You seem to have spent $");
			System.out.format("%.2f",overspent);
			System.out.println(" more than you made this month.");
		}else{
			System.out.println("You have spent precisely the amount of your income this month. Good Job!");
		}
	}
}
