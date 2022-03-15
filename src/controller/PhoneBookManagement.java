package controller;

import model.PhoneBook;
import storage.IOScanner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManagement {
    Scanner scanner = new Scanner(System.in);
    public PhoneBook phoneBook = new PhoneBook();
    IOScanner ioScanner = new IOScanner();
    public List<PhoneBook> phoneBookList;

    public PhoneBookManagement() {
        phoneBookList = new ArrayList<>();
    }

    public String showPhoneBook() {
        this.phoneBookList = readFile("phonebook.csv");
        String str ="";
        for (PhoneBook phoneBook : phoneBookList) {
            str += phoneBook.toString() +"\n";
        }
        return str;
    }


    public void addPhoneBook() {
        phoneBookList.add(ioScanner.inputPhoneBook());
        writeFile("phonebook.csv", this.phoneBookList);
        System.out.println("Add number success");
    }


    public void updatePhoneBook(String phoneNumber, PhoneBook phoneBook){
        if (findByPhoneNumber(phoneNumber) == null) {
            System.out.println("The number does not exist!");
        } else {
            ioScanner.inputUpdate(phoneBook);
            writeFile("phonebook.csv", this.phoneBookList);
            System.out.println("Edit success!");
        }
        showPhoneBook();
    }

    public String findByPhoneNumber(String phoneNumber){

        for (PhoneBook phoneBook : phoneBookList){
            if(phoneBook.getPhoneNumber().equals(phoneNumber)){
                System.out.println("Found it");
                System.out.println(phoneBook);
                return phoneNumber;
            }
        }
        System.out.println("Can't find it");
        return null;
    }

    public void deleteByPhoneNumber(String phoneNumber) {
        if (findByPhoneNumber(phoneNumber) == null) {
            System.out.println("The number does not exist!");
        } else {
            phoneBookList.remove(findByPhoneNumber(phoneNumber));
            writeFile("phonebook.csv", this.phoneBookList);
            System.out.println("Delete success!");
        }
        showPhoneBook();
    }



    public List<PhoneBook> readFile(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            phoneBookList = (List<PhoneBook>) objectInputStream.readObject();
            System.out.println(phoneBookList);
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception exception) {
            System.out.println("Can't read the file");
        }
        return phoneBookList;
    }


    public void writeFile(String path, List<PhoneBook> phoneBookList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(phoneBookList);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioException) {
            System.out.println("Write success");
        }
    }
}
