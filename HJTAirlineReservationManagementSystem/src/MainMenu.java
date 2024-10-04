/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jasper
 */
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            System.out.println("------------------------------------------");
            System.out.println("HJT AIRLINE RESERVATION MANAGEMENT SYSTEM\n");
            System.out.println("               Main Menu");
            System.out.println("Book Flight/s                 [1]");
            System.out.println("Passenger Search              [2]");
            System.out.println("Cancel Flight                 [3]");
            System.out.println("Exit                          [0]\n");
            System.out.print("Enter Choice: ");
            
            int opt1 = scanner.nextInt();
            switch (opt1) {
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    break;
                }
            }
        }

    }

}
