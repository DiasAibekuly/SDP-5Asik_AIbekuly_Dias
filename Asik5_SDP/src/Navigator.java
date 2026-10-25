public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Initial route strategy cannot be null.");
        }
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Route strategy cannot be null.");
        }
        this.strategy = strategy;
    }

    public void executeRoute(String origin, String destination) {
        if (origin == null || origin.trim().isEmpty() || destination == null || destination.trim().isEmpty()) {
            throw new IllegalArgumentException("Origin and destination must be valid non-empty strings.");
        }
        strategy.buildRoute(origin, destination);
    }
}
