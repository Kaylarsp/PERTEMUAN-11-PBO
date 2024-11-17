public class Main {
    public static void main(String[] args) {
        DogCare dog = new DogCare("Siberian Husky", 5);
        dog.healthCheck();
        dog.vaccinate();
        dog.groom();

        CatCare cat = new CatCare("Black", 3);
        cat.healthCheck();
        cat.vaccinate();
        cat.scratchPostTraining();

        BirdCare bird = new BirdCare(0.5, 2);
        bird.healthCheck();
        bird.vaccinate();
        bird.trimWings();
    }
}
