package temp.taxi;
public class Demo {
    public static void main(String[] args) {
        CityTaxiService.addTaxi(1, 1, 1);
        CityTaxiService.addTaxi(2, 2, 2);
        CityTaxiService.addTaxi(3, 3, 3);

        int passengerLocationX = 4;
        int passengerLocationY = 4;

        Taxi nearestTaxi = CityTaxiService.findNearestAvailableTaxi(passengerLocationX, passengerLocationY);

        if (nearestTaxi != null) {
            System.out.println("Taxi " + nearestTaxi.getId() + " is assigned to the passenger.");
            System.out.println("Taxi's current location: X=" + nearestTaxi.getLocation()[0] +
                    ", Y=" + nearestTaxi.getLocation()[1]);
        } else {
            System.out.println("No available taxis found.");
        }
    }
}