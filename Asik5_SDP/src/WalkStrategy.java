public class WalkStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Walk Route: " + origin + " -> " + destination
                + " (Distance: 10 km, Time: 120 mins, Uses pedestrian walkways).");
    }
}
