public class DogCare implements PetCare {
    private String breed;
    private int age;

    public DogCare(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    @Override
    public void healthCheck() {
        System.out.println("Performing health check for the dog");
        System.out.println(".....");
        System.out.println("Health check has been done :)");
        System.out.println();
    }

    @Override
    public void vaccinate() {
        System.out.println("Vaccinating the dog");
        System.out.println(".....");
        System.out.println("Vaccination has been done :)");
        System.out.println();
    }

    public void groom() {
        System.out.println("Grooming the dog");
        System.out.println(".....");
        System.out.println("Grooming has been done :)");
        System.out.println();
    }
}
