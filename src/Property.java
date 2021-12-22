public class Property {
    private Address address; //רחוב
    private int numOfRooms; // מספר חדרים
    private int price; // מחיר
    private String typeOfProperty;  // סוג
    private boolean forRent; // האם להשכרה
    private  int houseNumber;
    private int floorNumber;// מספר קומה
    private String  userWhoPostedTheProperty; // המשתמש שפירסם

    public Address getAddress() {
        return address;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public String getTypeOfProperty() {
        return typeOfProperty;
    }

    public int getPrice() {
        return price;
    }

    public String getUserWhoPostedTheProperty() {
        return userWhoPostedTheProperty;
    }

    public boolean isForRent() {
        return forRent;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setForRent(boolean forRent) {
        this.forRent = forRent;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTypeOfProperty(String typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }

    public void setUserWhoPostedTheProperty(String userWhoPostedTheProperty) {
        this.userWhoPostedTheProperty = userWhoPostedTheProperty;
    }

    @Override
    public String toString() {
        return "Property{" +
                "address=" + this.address +
                ", numOfRooms=" + numOfRooms +
                ", price=" + price +
                ", typeOfProperty='" + typeOfProperty + '\'' +
                ", forRent=" + forRent +
                ", houseNumber=" + houseNumber +
                ", floorNumber=" + floorNumber +
                ", userWhoPostedTheProperty='" + userWhoPostedTheProperty + '\'' +
                '}';
    }
}
