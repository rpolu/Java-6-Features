package com.java.ram;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {

		Console console = System.console();

		String text = console.readLine("Usert name :");

		System.out.println(text);

		char[] password = console.readPassword("Password : ");
		System.out.println(password);

		console.flush();

	}

}
