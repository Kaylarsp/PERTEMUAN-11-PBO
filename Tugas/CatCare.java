public class CatCare implements PetCare{
    private String color;
    private int age;

    public CatCare(String color, int age) {
        this.color = color;
        this.age = age;
    }

    @Override
    public void healthCheck() {
        System.out.println("Performing health check for the cat");
        System.out.println(".....");
        System.out.println("Health check has been done :)");
        System.out.println();
    }

    @Override
    public void vaccinate() {
        System.out.println("Vaccinating the cat");
        System.out.println(".....");
        System.out.println("Vaccination has been done :)");
        System.out.println();
    }

    public void scratchPostTraining() {
        System.out.println("Training the cat to use the scratch post");
        System.out.println(".....");
        System.out.println("Training has been done :)");
        System.out.println();
    }
}
