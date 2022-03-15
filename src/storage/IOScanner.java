package storage;

import model.PhoneBook;

import java.util.Scanner;

public class IOScanner {
    Scanner scanner = new Scanner(System.in);

    public IOScanner() {
    }

    public PhoneBook inputPhoneBook() {
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter group phone number: ");
        String group = scanner.nextLine();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Enter your birthday: ");
        String birthday = scanner.nextLine();
        System.out.println("Enter your email: ");
        String email = scanner.nextLine();
        if (phoneNumber != null & group != null && name != null & gender != null & address != null & birthday != null & email != null) {
            PhoneBook phoneBook = new PhoneBook(phoneNumber, group, name, gender, address, birthday, email);
            return phoneBook;
        }
        System.out.println("Miss information! Re-enter again");
        return null;
    }

    public void inputUpdate(PhoneBook updatePhone) {
        System.out.println("Enter to find phone number: ");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber != null) {
            updatePhone.setPhoneNumber(phoneNumber);
        }

        System.out.println("Enter new group: ");
        String group = scanner.nextLine();
        if (group != null) {
            updatePhone.setGroupPhoneBook(group);
        }

        System.out.println("Enter new name:");
        String name = scanner.nextLine();
        if (name != null) {
            updatePhone.setName(name);
        }

        System.out.println("Enter new gender: ");
        String gender = scanner.nextLine();
        if (gender != null) {
            updatePhone.setGender(gender);
        }

        System.out.println("Enter new address: ");
        String address = scanner.nextLine();
        if (address != null) {
            updatePhone.setAddress(address);
        }

        System.out.println("Enter new birthday: ");
        String birthday = scanner.nextLine();
        if (birthday != null) {
            updatePhone.setBirth(birthday);
        }

        System.out.println("Enter new email: ");
        String email = scanner.nextLine();
        if (email != null) {
            updatePhone.setEmail(email);
        }
    }
}
