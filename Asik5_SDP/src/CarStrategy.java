public class CarStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Car Route: " + origin + " -> " + destination
                + " (Distance: 12 km, Time: 20 mins, Avoids traffic jams).");
    }
}