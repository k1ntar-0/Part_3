/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_preparation;

/**
 *
 * @author Kintro
 */
public class Message {
    private static int totalMessages = 0;

    String id;
    int count;
    String recipient;
    String content;
    String hash;

    // Constructor
    public Message(String id, int count, String recipient, String content, String hash) {
        this.id = id;
        this.count = count;
        this.recipient = recipient;
        this.content = content;
        this.hash = hash;
        totalMessages++; // Track total messages created
    }

    // Prints all message details nicely
    public String printMessageDetails() {
        return String.format(
            "Message ID: %s%nRecipient: %s%nContent: %s%nHash: %s%nCount: %d",
            id, recipient, content, hash, count
        );
    }

    // Static method to return total messages
    public static int getTotalMessages() {
        return totalMessages;
    }

    // Getters (optional, if you wanna access data)
    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }

    public String getHash() {
        return hash;
    }

    // Setters (optional, for editing fields later)
    public void setId(String id) {
        this.id = id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}

