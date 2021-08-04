package whileloop;

import java.util.Scanner;

public class BusFare {

	static String name = "WELCOME to  salary calculation and bus fare ";

	public static void main(String[] args) {

		System.out.println(BusFare.name);
		System.out.println();

		Scanner salary = new Scanner(System.in);
		System.out.println("enter your salary");

		int amount = salary.nextInt();
		System.out.println("salary is " + amount);

		Scanner ticket = new Scanner(System.in);
		System.out.println("enter your ticket price per day");

		int fare = ticket.nextInt();
		int j = fare * 30;

		System.out.println("per month your ticket price =" + j);
		System.out.println("per day your salary is " + amount / 30);
		System.out.println("per year you salary is " + amount * 12);
		System.out.println();
		System.out.println();
		System.out.println("FOR WOMEN GOVERMENT OFFER YOU A FREE TICKET BECAUSER OF THAT YOU CAN SAVE");
		System.out.println();
		System.out.println("per month your saving is  =  " + j);
		System.out.println("per year your savings  is = " + j * 12);

	}

}

