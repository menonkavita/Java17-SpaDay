package org.launchcode.data;

import org.launchcode.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


// Studio Bonus Mission #1
public class UserData {
    private static final Map<Integer, User> userObj = new HashMap<>();

    public static Collection<User> getAll(){
        return userObj.values();
    }

    public static User getById(int id){
        return userObj.get(id);
    }

    public static void add(User u){
        userObj.put(u.getId(), u);
    }


    // Not required for Bonus Missions Chapter 14
//    public static void edit(User u){
//        userObj.replace(u.getId(), u);   // replaces value based on key
//    }
//
//    public static void remove(int id){
//        userObj.remove(id);
//    }

}
