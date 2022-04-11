public record ElectricLamp(String manufacturer, int lightingPower, int dayWarranty, String producingCountry,
        String color, double price) {

    static final String size = "Standart size";

    public ElectricLamp() {
        this("Not defiend", 0, 0, "Not defiend", "Not defiend", 0.0);
    }

    public ElectricLamp(String manufacturer, String producingCountry, double price) {
        this(manufacturer, 0, 0, producingCountry, "Not defiend", price);
    }

    public ElectricLamp {
        if (price < 0.0) {
            throw new IllegalArgumentException(
                    "Electric Lamp Price cannot be below 0.0 uah.");
        }
    }

    public static String size() {
        return size;
    }

    @Override
    public String toString() {
        return "ElectricLamp(manufacturer : " + this.manufacturer + ", lightPower = " + this.lightingPower
                + ", dayWarranty = " + this.dayWarranty + ", producingCountry : " + this.producingCountry + ", color : "
                + this.color + ", price = " + this.price + "  )";
    }

}
