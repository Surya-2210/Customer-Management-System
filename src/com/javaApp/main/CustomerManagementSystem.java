package com.javaApp.main;

import com.javaApp.entity.Customer;
import com.javaApp.operations.CustomerOperations;

public class CustomerManagementSystem {
    public static void main(String[] args) {
        CustomerOperations operations = new CustomerOperations();

        //1. display initial customers
        System.out.println("Initial Customers : ");
        operations.displayCustomers();
        System.out.println();

        //2. Adding customer 106
        System.out.println("Adding customer 106");
        boolean isAdded = operations.addCustomer(106,"Bhagyashri","Bosre",'F');
        System.out.println("Customer Added:"+isAdded);
        System.out.println();

        //3. add Same customer
        System.out.println("Adding same customer");
        boolean duplicate = operations.addCustomer(104,"Ritu","Varma",'F');
        System.out.println("Duplicate customer:"+duplicate);
        System.out.println();

        //4. update customer id 103
        System.out.println("Updating customerId 102");
        boolean updated = operations.updateCustomer(102,"Nitish Kumar","Reddy",'M');
        System.out.println("Customer updated:"+updated);
        System.out.println("Updated customer:"+operations.findCustomerById(102));
        System.out.println();

        //5. delete customer id 104
        System.out.println("Deleting customer id 104");
        boolean deleted = operations.deleteCustomer(101);
        System.out.println("Customer deleted:"+deleted);
        System.out.println();

        //6. find and display customer id 102
        System.out.println("Finding customer id 102");
        Customer customerById = operations.findCustomerById(102);
        if(customerById != null){
            System.out.println(customerById);
            System.out.println();
        }else {
            System.out.println("Not found customer by id: 102");
        }

        //7. find and display customer name : Kiran
        System.out.println("Finding customer by name: ");
        Customer customerByName = operations.findCustomerByFirstName("Bhagyashri");
        if(customerByName != null){
            System.out.println(customerByName);
            System.out.println();
        }else{
            System.out.println("Not found customer by name : Bhagyashri");
        }

        //8.Checking customer id:999 exist or not
        System.out.println("Finding customer by ID:");
        Customer missingCustomer = operations.findCustomerById(102);
        if(missingCustomer != null){
            System.out.println(missingCustomer);
        }else{
            System.out.println("Not found a customer by id: ");
            System.out.println();
        }

        //9. display all customers
        operations.displayCustomers();
    }

}
