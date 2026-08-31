// July 29, 2025

public class Code41 {
    public static void main(String[] args) {

        // Overloaded Constructor = allow class to have multiple constructors with different paramter list 
        User user1 = new User("Matt");
        User user2 = new User("Katy", "waiting4Katy@aol.com");
        User user3 = new User("Steve", "Steve@gmail.com", 27);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}

class User { // Class attributes are optional

    String username;
    String email;
    int age;

    User(){ // This is the constructor with no parameters
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }
    User(String username){ // This is a constructor with one parameter
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    User(String username, String email){ // This is a constructor with two parameters
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    User(String username, String email, int age){ // This is a constructor with three parameters
        this.username = username;
        this.email = email;
        this.age = age;
    }
}