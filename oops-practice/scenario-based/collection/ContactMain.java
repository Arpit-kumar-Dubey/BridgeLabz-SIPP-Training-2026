package scenarioBased;

import java.util.*;

public class ContactMain {

    public static void main(String[] args) {

        ArrayList<Contact> list = new ArrayList<>();

        HashMap<String, Contact> map = new HashMap<>();

        HashSet<String> phoneSet = new HashSet<>();

        addContact(list, map, phoneSet, new Contact("Arpit", "9876543210", "arpit@gmail.com"));
        addContact(list, map, phoneSet, new Contact("Rahul", "9999999999", "rahul@gmail.com"));
        addContact(list, map, phoneSet, new Contact("Aman", "8888888888", "aman@gmail.com"));

        addContact(list, map, phoneSet, new Contact("Rohit", "9876543210", "rohit@gmail.com"));

        System.out.println("------ Search Contact ------");
        searchContact(map, "Rahul");

        System.out.println("\n------ Delete Contact ------");
        deleteContact(list, map, phoneSet, "Aman");

        System.out.println("\n------ All Contacts (Sorted) ------");
        Collections.sort(list, new SortByName());

        for(Contact c : list){
            System.out.println("---------------------------");
            System.out.println(c);
        }
    }

    public static void addContact(ArrayList<Contact> list,
                                  HashMap<String, Contact> map,
                                  HashSet<String> phoneSet,
                                  Contact c){

        if(phoneSet.contains(c.phone)){
            System.out.println("Duplicate Phone Number! Contact Not Added.");
            return;
        }

        list.add(c);
        map.put(c.name, c);
        phoneSet.add(c.phone);

        System.out.println(c.name + " Added Successfully.");
    }
    public static void searchContact(HashMap<String, Contact> map,
                                     String name){

        if(map.containsKey(name)){
            System.out.println(map.get(name));
        }
        else{
            System.out.println("Contact Not Found.");
        }
    }
    public static void deleteContact(ArrayList<Contact> list,
                                     HashMap<String, Contact> map,
                                     HashSet<String> phoneSet,
                                     String name){

        Contact c = map.remove(name);

        if(c != null){
            list.remove(c);
            phoneSet.remove(c.phone);
            System.out.println(name + " Deleted Successfully.");
        }
        else{
            System.out.println("Contact Not Found.");
        }
    }
}