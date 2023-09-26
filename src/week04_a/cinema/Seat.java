package week04_a.cinema;

public class Seat {
    String seatID;
    String category;
    String colour;
    double price;
    boolean reserved;

    public Seat(String seatID, String category, String colour, double price, boolean reserved) {
        this.seatID = seatID;
        this.category = category;
        this.colour = colour;
        this.price = price;
        this.reserved = reserved;
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatID='" + seatID + '\'' +
                ", category='" + category + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", reserved=" + reserved +
                '}';
    }
}
