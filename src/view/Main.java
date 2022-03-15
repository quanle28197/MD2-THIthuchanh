package view;

import controller.PhoneBookManagement;

import java.util.Scanner;

public class Main {
    public static  Scanner scanner = new Scanner(System.in);
    public static PhoneBookManagement phoneBookManagement = new PhoneBookManagement();

    public static void main(String[] args) {
        String choice;
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice) {
                case "1" : {
                    phoneBookManagement.showPhoneBook();
                }
                break;
                case "2": {
                    phoneBookManagement.addPhoneBook();
                }
                break;
                case "3": {
                    System.out.print("Enter to update phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBookManagement.updatePhoneBook(phoneNumber, phoneBookManagement.phoneBook);
                }
                break;
                case "4": {
                    System.out.println("Enter to delete by phone number: ");
                    String phoneBook = scanner.nextLine();
                    phoneBookManagement.deleteByPhoneNumber(phoneBook);
                }
                break;
                case "5": {
                    System.out.print("Enter to find by number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBookManagement.findByPhoneNumber(phoneNumber);
                }
                break;
                case "6" : {
                    phoneBookManagement.readFile("phonebook.csv");
                }
                break;
                case "7": {
                    phoneBookManagement.writeFile("phonebook.csv", phoneBookManagement.phoneBookList);
                }
                break;
            }
        }while (!choice.equals(8));
    }

    public static void menu() {
        System.out.println("--------PHONE BOOK MANAGEMENT--------");
        System.out.println("--------SELECT FUNCTION BY NUMBER--------");
        System.out.println("1: Show phone book: ");
        System.out.println("2: Add phone book: ");
        System.out.println("3: Update phone book: ");
        System.out.println("4: Delete phone book: ");
        System.out.println("5: Find by phone number: ");
        System.out.println("6: Read File CSV: ");
        System.out.println("7: Write File CSV: ");
        System.out.println("8: Exit ");
    }
}
