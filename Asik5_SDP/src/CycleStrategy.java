public class CycleStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Cycle Route: " + origin + " -> " + destination
                + " (Distance: 11 km, Time: 40 mins, Uses dedicated bicycle lanes).");
    }
}
