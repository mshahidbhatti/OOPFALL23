package temp.taxi;

public class Taxi {
    private int id;
    private int location[];
    private boolean isAvailable;

    public Taxi(int id, int x, int y) {
        this.id = id;
        this.location = new int[]{x,y};
    }

    public int getId(){
        return id;
    }
    public int[] getLocation(){
        return location;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void toggleAvailability(){
        isAvailable=!isAvailable;
    }
    public void updateLocation(int x, int y){
        location=new int[]{x,y};
    }

}
