package com.multimodule.com;
import java.util.Scanner;

public class GetUserName {
	public static String GetName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the User Name: ");
		String userName= scanner.nextLine();
		return userName;
	}
}
