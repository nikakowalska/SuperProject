package com.sliskaryba;

import com.sliskaryba.api.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class SliskarybaApplication {

//public static void main(String[] args) {
//SpringApplication.run(SliskarybaApplication.class, args);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println(menu.displayA());
        System.out.println(menu.displayB());
        String choice = scanner.nextLine().toUpperCase();
        switch (choice) {
            case ("A"):
                System.out.println(menu.displayMonsters());
            case ("B"):
                System.out.println(menu.displayHeroes());
        }
        scanner.close();
    }

}
