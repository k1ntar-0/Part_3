/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_preparation;

import java.util.ArrayList;
import java.util.List;

public class storedMessages {
    private static List<Message> messages = new ArrayList<>();

    public static void addMessage(Message m) {
        messages.add(m);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static boolean isEmpty() {
        return messages.isEmpty();
    }

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
