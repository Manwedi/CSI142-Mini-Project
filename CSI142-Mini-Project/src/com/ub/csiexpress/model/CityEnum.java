package com.ub.csiexpress.model;

public CityEnum {
  Kasane(-17.8294, 25.1528),
  Francistown(-21.1671, 27.5126),    
  Maun(-19.9833, 23.4167),
  Orapa(-21.3167, 25.3667),
  Selibe_Phikwe(-21.9783, 27.9067),
  Palapye(-22.5467, 27.1289),
  Mahalapye(-23.1061, 26.8117),
  Tsabong(-26.0275, 22.4017),
  Serowe(-22.3833, 26.7167),
  Letlhakane(-21.4167, 25.5833),
  Ghanzi(-21.7000, 21.6500),
  Gaborone(-24.6282, 25.9231);

  private final double latitude;
  private final double longitude;

  CityEnum(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
  }
  public getLatitude() {
    return latitude;
  }
  public getLongitude() {
    return longitude;
  }
  public double distanceTo(CityEnum other) {
        final int EARTH_RADIUS_KM = 6371;
        double lat1 = Math.toRadians(this.latitude);
        double lat2 = Math.toRadians(other.latitude);
        double latRad = Math.toRadians(other.latitude - this.latitude);
        double lonRad = Math.toRadians(other.longitude - this.longitude);

        double a = Math.sin(latRad / 2) * Math.sin(latRad / 2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.sin(lonRad / 2) * Math.sin(lonRad / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS_KM * c;
    }
   public static CityEnum fromString(String input) { //
        String normalized = input.trim().toUpperCase().replace(" ", "_");
        return CityEnum.valueOf(normalized);
    }
   @Override
    public String toString() {
        String name = name().replace("_", " ");
        String[] words = name.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return result.toString().trim(); // "Selibe Phikwe" instead of "Selibe phikwe"
    }
}
