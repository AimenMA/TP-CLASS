public class Temperature {
     private double value; 

    public Temperature(double value) {
       
        if (value < -273.15) {
            throw new IllegalArgumentException("Invalid ");
        }
         this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < -273.15) {
            throw new IllegalArgumentException("Invalid");
        }
        this.value = value;
    }
}
