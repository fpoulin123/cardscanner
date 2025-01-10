package ca.xpertproject.apps.cardscanner;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardscannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardscannerApplication.class, args);
		
		Scanner scanner = new Scanner(System.in);
		
		String cardnumber = scanner.nextLine();
		
		System.out.println(cardnumber);
	}

}
