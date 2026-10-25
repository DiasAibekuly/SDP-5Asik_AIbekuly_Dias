public class PublicTransitStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Public Transit Route: " + origin + " -> " + destination
                + " (Distance: 13 km, Time: 35 mins, Includes Bus #18 and Metro Line 1).");
    }
}
