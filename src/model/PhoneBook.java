package model;

import java.io.Serializable;

public class PhoneBook implements Serializable {
    private String phoneNumber;
    private String groupPhoneBook;
    private String name;
    private String gender;
    private String address;
    private String birth;
    private String email;

    public PhoneBook() {
    }

    public PhoneBook(String phoneNumber, String groupPhoneBook, String name, String gender, String address, String birth, String email) {
        this.phoneNumber = phoneNumber;
        this.groupPhoneBook = groupPhoneBook;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birth = birth;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupPhoneBook() {
        return groupPhoneBook;
    }

    public void setGroupPhoneBook(String groupPhoneBook) {
        this.groupPhoneBook = groupPhoneBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "phoneBook{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", groupPhoneBook='" + groupPhoneBook + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", birth='" + birth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
