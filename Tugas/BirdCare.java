public class BirdCare implements PetCare {
    private double wingSpan;
    private int age;

    public BirdCare(double wingSpan, int age) {
        this.wingSpan = wingSpan;
        this.age = age;
    }

    @Override
    public void healthCheck() {
        System.out.println("Performing health check for the bird");
        System.out.println(".....");
        System.out.println("Health check has been done :)");
        System.out.println();
    }

    @Override
    public void vaccinate() {
        System.out.println("Vaccinating the bird");
        System.out.println(".....");
        System.out.println("Vaccination has been done :)");
        System.out.println();
    }

    public void trimWings() {
        System.out.println("Trimming the bird's wings");
        System.out.println(".....");
        System.out.println("Bird's wings have been trimmed :)");
        System.out.println();
    }
}
