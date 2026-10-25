public class NavigatorTest {

    public static void main(String[] args) {
        System.out.println("Starting unit tests for Navigator...\n");

        testConstructor_NullStrategy_ThrowsException();
        testSetStrategy_NullStrategy_ThrowsException();
        testExecuteRoute_InvalidLocations_ThrowsException();
        testRuntimeStrategySwitching_Success();

        System.out.println("\nAll unit tests passed successfully.");
    }

    public static void testConstructor_NullStrategy_ThrowsException() {
        System.out.print("Test 1: Constructor null validation... ");
        try {
            new Navigator(null);
            System.out.println("FAILED (Expected IllegalArgumentException)");
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("Initial route strategy cannot be null.")) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED (Incorrect exception message)");
            }
        }
    }

    public static void testSetStrategy_NullStrategy_ThrowsException() {
        System.out.print("Test 2: Setter null strategy validation... ");
        Navigator navigator = new Navigator(new CarStrategy());
        try {
            navigator.setStrategy(null);
            System.out.println("FAILED (Expected IllegalArgumentException)");
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("Route strategy cannot be null.")) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED (Incorrect exception message)");
            }
        }
    }

    public static void testExecuteRoute_InvalidLocations_ThrowsException() {
        System.out.print("Test 3: Location string validation... ");
        Navigator navigator = new Navigator(new WalkStrategy());
        try {
            navigator.executeRoute("", "Baiterek");
            System.out.println("FAILED (Expected IllegalArgumentException)");
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("Origin and destination must be valid non-empty strings.")) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED (Incorrect exception message)");
            }
        }
    }

    public static void testRuntimeStrategySwitching_Success() {
        System.out.print("Test 4: Runtime strategy switching... ");
        try {
            Navigator navigator = new Navigator(new CarStrategy());
            navigator.executeRoute("A", "B");
            navigator.setStrategy(new CycleStrategy());
            navigator.executeRoute("A", "B");
            System.out.println("PASSED");
        } catch (Exception e) {
            System.out.println("FAILED (Unexpected exception: " + e.getMessage() + ")");
        }
    }
}
