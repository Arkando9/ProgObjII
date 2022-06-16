/**
 * pakiet odpowiedzialny za tworzenie obiektów typu Planet
 */
package probprojekt;

/**
 * klasa pozwalająca tworzyć obiekty Planet
 * @author Arek
 * @author Jakub
 * @author Karol
 */
public class Planet {
    
    /**
     * atrybut obiektu klasy Planet, określający promień
     */
    int promien;
    /**
     * atrybut obiektu klasy Planet, określający prędkość
     */
    int speed;
    /**
     * atrybut obiektu klasy Planet, określający masę
     */
    int masa;
    /**
     * atrybut obiektu klasy Planet, określający stopnie
     */
    double degrees;
    
    

    /**
     * konstruktor argumentowy
     * @param promien promien
     * @param speed prędkość
     * @param degrees stopnie
     * @param masa masa
     */
    public Planet(int promien, int speed, double degrees, int masa) {
        this.promien = promien;
        this.speed = speed;
        this.degrees = degrees;
        this.masa = masa;
    }
    
    /**
     * pusty konstruktor
     */
     public Planet() {
    }
    
     
     /**
      * Builder obiektu klasy Planet
      * @return obiekt Planety
      */
      public static Builder builder() {
        return new Builder();
    }
    
      /**
       * Klasa builder tworząca i przypisująca wartości atrybutom tworzonego obiektu
       */
     public static final class Builder {
        int promien;
        int speed;
        double degrees;
        int masa;

        /**
         * builder
         */
        private Builder() {
        }

        /**
         * fragment buildera przypisujący wartość promienia
         * @param promien promień
         * @return promieć
         */
        public Builder promien(int promien) {
            this.promien = promien;
            return this;
        }

        /**
         * fragment buildera przypisujący wartość prędkości
         * @param speed prędkość
         * @return  prędkość
         */
        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        /**
         * fragment buildera przypisujący wartość stopni
         * @param degrees stopnie
         * @return stopnie
         */
        public Builder degrees(double degrees) {
            this.degrees = degrees;
            return this;
        }
        
        /**
         * fragment buildera przypisujący wartość masy
         * @param masa masa
         * @return masa
         */
        public Builder masa(int masa) {
            this.masa = masa;
            return this;
        }

        /**
         * wywołanie Buildera
         * @return stworzony obiekt
         */
        public Planet build() {
            Planet planet = new Planet();
            planet.setPromien(promien);
            planet.setSpeed(speed);
            planet.setDegrees(degrees);
            planet.setMasa(masa);
            return planet;
        }
    }

    

     /**
      * getter dla Promienia
      * @return promień
      */
    public int getPromien() {
        return promien;
    }

    /**
     * setter dla promienia
     * @param promien promień
     */
    public void setPromien(int promien) {
        this.promien = promien;
    }

    /**
     * getter dla prędkości
     * @return prędkość
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * setter dla prędkości
     * @param speed prędkość
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * getter dla masy
     * @return  masa
     */
    public int getMasa() {
        return masa;
    }

    /**
     * setter dla masy
     * @param masa masa
     */
    public void setMasa(int masa) {
        this.masa = masa;
    }

    /**
     * getter dla stopni
     * @return stopnie
     */
    public double getDegrees() {
        return degrees;
    }

    /**
     * settr dla stopni
     * @param degrees stopnie
     */
    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }
    
    


    
    
    
}
