package temp.taxi;

import java.util.HashMap;
import java.util.Map;

public class CityTaxiService {
    static Map<Integer, Taxi> taxis=new HashMap<>();
    public static void addTaxi(int taxiId, int x, int y) {
        taxis.put(taxiId, new Taxi(taxiId, x, y));
    }
    public static Taxi findNearestAvailableTaxi(int x, int y){
        double minDistance = Double.MAX_VALUE;
        Taxi nearestTaxi = null;

        for (Taxi taxi : taxis.values()) {
            if (taxi.isAvailable()) {
                // Simulated distance calculation (replace with actual logic)
                double distance = Math.sqrt(Math.pow(x - taxi.getLocation()[0], 2) +
                        Math.pow(y - taxi.getLocation()[1], 2));
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestTaxi = taxi;
                }
            }
        }
        if (nearestTaxi != null) {
            nearestTaxi.updateLocation(x, y);
            nearestTaxi.toggleAvailability();
        }

        return nearestTaxi;
    }
}
