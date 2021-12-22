import java.util.Scanner;

public class RealEstate {
    private User[] users;
    private Property property;
    private Address address;

    public Address getAddress() {

        return address;
    }

    public User[] getUsers() {
        return users;
    }

    public Property getProperty() {
        return property;
    }

    public void setUsers(User users[]) {
        this.users = users;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public void createUser(){
        Scanner scanner = new Scanner(System.in);
        String username = null;
        do {
            System.out.println("Enter username: ");
            username = scanner.nextLine();
        } while (isUsernameExist(username));
    }
    private void addUserToArray (String username, String password) {
        User[] newArray = new User[this.users.length + 1];
        for (int i = 0; i < this.users.length; i++) {
            newArray[i] = this.users[i];
        }
        User userToAdd = new User();
        newArray[this.users.length] = userToAdd;
        this.users = newArray;
    }
    private boolean isUsernameExist (String usernameToCheck) {
        boolean exists = false;
        for (int i = 0; i < this.users.length; i++) {
            if(this.users[i].getUserName().equals(usernameToCheck)) {
                exists = true;
                break;
            }
        }
        return exists;
    }
}
