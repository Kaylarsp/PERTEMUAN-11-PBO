public class MainElektronik {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Kipas dinding", 500000, "Putih", "Maspion");
        Kulkas kulkas = new Kulkas(2, 3000000, "Hitam", "Sharp");
        TV tv = new TV("LED", 10, 5000000, "Hitam", "Samsung");
        SmartFridge smartfridge = new SmartFridge(100, 2, 9999000, "Silver", "LG");
        
        System.out.println(kipas.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(tv.getInfo());
        System.out.println(smartfridge.getInfo());
    }
}
