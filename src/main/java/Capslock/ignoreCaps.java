package Capslock;

import java.util.Scanner;

public class ignoreCaps {
    public static void main(String[] args) {
        final String START = "start";
        final String STOP = "stop";
        final String QUIT = "quit";

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        do {
            System.out.println("Enter a command");
            String input = scanner.nextLine();

            if (input.length() == 0) {
                continue;
            }

                if (input.equalsIgnoreCase(START)) {
                    System.out.println("Machine starting...");
                } else if (input.equalsIgnoreCase(STOP)) {
                    System.out.println("Machine stopping...");
                } else if (input.equalsIgnoreCase(QUIT)) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Unrecognised command");
                }
        }
        while(running);
        scanner.close();
        }
    }
