package com.company;
import Methods.Customer_Controller;
import Methods.Customer_functions;
import PostgresDB.IDB;
import PostgresDB.PostgresDB;
import Entities.*;
public class Main {
    public static void main(String[] args) {
        IDB db = new PostgresDB();
        Customers repo = new Customer_functions(db);
        Customer_Controller controller = new Customer_Controller(repo);
        MyApplication app = new MyApplication(controller);
        app.Start();
    }

}
