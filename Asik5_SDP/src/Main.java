public class Main {
    public static void main(String[] args) {
        System.out.println("=== NAVIGATION SYSTEM (STRATEGY PATTERN) ===\n");

        RouteStrategy carStrategy = new CarStrategy();
        Navigator navigator = new Navigator(carStrategy);

        System.out.print("1. Driving: ");
        navigator.executeRoute("Astana IT University", "Baiterek Tower");

        navigator.setStrategy(new WalkStrategy());
        System.out.print("2. Walking: ");
        navigator.executeRoute("Astana IT University", "Baiterek Tower");


        navigator.setStrategy(new CycleStrategy());
        System.out.print("3. Cycling: ");
        navigator.executeRoute("Astana IT University", "Baiterek Tower");

        navigator.setStrategy(new PublicTransitStrategy());
        System.out.print("4. Transit: ");
        navigator.executeRoute("Astana IT University", "Baiterek Tower");
    }
}