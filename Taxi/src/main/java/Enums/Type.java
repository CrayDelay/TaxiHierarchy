package Enums;

public enum Type {
    MINIVAN("Minivan"),
    SEDAN("Sedan"),
    COUPE("Coupe"),
    SPORTS_CAR("Sports Car"),
    STATION_WAGON("Station Wagon"),
    HATCHBACK("Hatchback"),
    CONVERTIBLE("Convertible"),
    SPORT_UTILITY_VEHICLE("Sports Utility Vehicle"),
    PICKUP_TRUCK("Pickup Truck");

    public final String label;

    private Type(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
