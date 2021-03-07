package com.company;
import Methods.Customer_Controller;
import Methods.product_controller;
import Methods.Customer_functions;
import Entities.Customers;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MyApplication {
private final Customer_Controller controller;
private final Scanner scanner;
public MyApplication(Customer_Controller controller){
this.controller=controller;
scanner=new Scanner(System.in);
}
public void Start(){
while(true){
    System.out.println();
    System.out.println("Welcome to My Application");
    System.out.println("Select option:");
    System.out.println("1. Get all users");
    System.out.println("2. Get user by id");
    System.out.println("3. Add Money");
    System.out.println("4. Analyze age group of product");
    System.out.println("0. Exit");
    System.out.println();
    try{
    System.out.print("Enter option (1-4): ");
    int option = scanner.nextInt();
    if (option == 1) {
        getAllCustomersMenu();
    } else if (option == 2) {
        getCustomerByIdMenu();
    } else if (option == 3) {
        getAddMoney();
    }else if (option == 4) {
        getAgeGroupanalyzerMenu();
    } else {
        break;
    }
} catch (InputMismatchException e) {
        System.out.println("Input must be integer");
        scanner.nextLine(); // to ignore incorrect input
    }
            catch (Exception e) {
        System.out.println(e.getMessage());
    }

    System.out.println("*************************");

}
}
    public void getAllCustomersMenu() {
        String response = controller.getAllCustomers();
        System.out.println(response);
    }

    public void getCustomerByIdMenu() {
        System.out.println("Please enter id");

        String id = scanner.next();
        String response = controller.getCustomer(id);
        System.out.println(response);
    }
    public void getAddMoney(){
        System.out.println("please enter id");
        String id = scanner.next();
        System.out.println("please enter money amount that will add");
        Double money=scanner.nextDouble();
        String response= controller.getAddMoney(money,id);
        System.out.println(response);
    }
    public void getAgeGroupanalyzerMenu(){
    System.out.println("Top 3 interesting products");
    String response = controller.getInterestingproductanalyzer();
    System.out.println(response);
    }
//
//    public void createUserMenu() {
//        System.out.println("Please enter name");
//        String name = scanner.next();
//        System.out.println("Please enter surname");
//        String surname = scanner.next();
//        System.out.println("Please enter gender (male/female)");
//        String gender = scanner.next();
//
//        String response = controller.createUser(name, surname, gender);
//        System.out.println(response);
//    }
}
