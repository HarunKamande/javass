public class Benz extends Car {
    public Benz(String name, String manufacturer, String licenseProvider) {
        super(name, manufacturer, licenseProvider);
    }

    public static void main(String[] args) {
        Benz b1 = new Benz("Benz", "Benzmotors", "LicenseProvider");

        b1.setManufucturer("Benzmotors");
        b1.setLincence_provider("Benz_licence");
        b1.setName("Mercedes benz");


        System.out.println(b1.getName());
        System.out.println(b1.getManufucturer());
        System.out.println(b1.getLincence_provider());
    }
}
