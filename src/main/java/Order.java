public class Order {

    private int id;
    private String number;

    public Order(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
}
