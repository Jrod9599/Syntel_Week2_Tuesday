package com.company;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    Map<String, String> phonebook = new HashMap<String, String>();

    Phonebook(){
        phonebook.put("Alice", "703-493-1834");
        phonebook.put("Bob","857-384-1234");
        phonebook.put("Elizabeth", "484-584-2923");

    }

    public void addPerson(String name, String number){
        phonebook.put(name, number);
    }

    public void getElizNum(){
        System.out.println(phonebook.get("Elizabeth"));
    }

    public void removePerson(String key){
        phonebook.remove(key);
        System.out.println("Removed " + key);
    }

    public void changeNum(String key, String number){
        phonebook.put(key, number);
    }

    public void getNum(String key){
        System.out.println(key + " = " + phonebook.get(key));
    }

    public void printPhonebook(){
        for(Map.Entry<String, String> entry: phonebook.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }




}
