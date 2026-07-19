public class JedliksToyCar {
    int metersDriven; 
    int battery = 100;
    public static JedliksToyCar buy() {
        JedliksToyCar newCar = new JedliksToyCar();
        return newCar; 
    }

    public String distanceDisplay() {
        String driven = ("Driven " + metersDriven +" meters");
        return driven;
    }

    public String batteryDisplay() {
        if (battery > 0){
            String batteryDis = ("Battery at "+ battery + "%");
        return batteryDis; 
        }
        else {
            String emptyDis = "Battery empty"; 
            return emptyDis; 
        }
        
    }

    public void drive() {
       if (battery > 0){
            metersDriven = metersDriven + 20 ;
        battery = battery - 1; 
        } 
    }
}
