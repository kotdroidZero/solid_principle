package solid;


//A class should have one, and only one, reason to change.
public class SingleResponsibilityP {

}


class User {
    String email;
    String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /// This method should not be there as it is directly not related to User
    // This is violating the concept of Single Responsibility Principle
    public void registerUser(User user) {
        // logic to register User
    }

}


class User2 {
    String email;
    String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


class UserRepository {

    User2 user;

    public void registerUser(User2 user) {
        this.user = user;
        // logic to save user
    }
}


