// July 29, 2025

public class Code43 {
    public static void main(String[] args) {

        // static MODIFIES variable/method belong to a class
        // Used for utility methods

        Friend friend1 = new Friend("Kim");
        Friend friend2 = new Friend("Mark");
        Friend friend3 = new Friend("Harold");
        Friend friend4 = new Friend("Dolores");
        Friend friend5 = new Friend("Emma");


        System.out.println(Friend.numFriends); //
        Friend.showFriends();

    }
}

class Friend {

    static int numFriends; // all object have access
    String name;

    Friend(String name){ // constructor passes in strings
        this.name = name;
        numFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numFriends + " total friends.");
    }
}