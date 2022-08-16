package classes;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for reading binary documents
 */

public class ReadDoc {

    public ArrayList<Customer> readCustomer(){
        ArrayList<Customer> customerList = new ArrayList<>();
        try {
            ObjectInputStream readFile = new ObjectInputStream(new FileInputStream(new File("dat/customerList.ser")));
            customerList = (ArrayList<Customer>)readFile.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customerList;
    }
    public void writeCustomer(ArrayList<Customer> customers){
        ArrayList<Customer> customerList = new ArrayList<>(customers);
        try {
            ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(new File("dat/customerList.ser")));
            for(Customer customer : customerList)
                writeFile.writeObject(customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Provider> readProvider(){
        ArrayList<Provider> providerList = new ArrayList<>();
        try {
            ObjectInputStream readFile = new ObjectInputStream(new FileInputStream(new File("dat/providerList.ser")));
            providerList = (ArrayList<Provider>)readFile.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return providerList;
    }
    public void writeProvider(ArrayList<Provider> providers){
        ArrayList<Provider> providerList = new ArrayList<>(providers);
        try {
            ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(new File("dat/providerList.ser")));
            for(Provider customer : providerList)
                writeFile.writeObject(customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
