public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int base =  speed * 221;
        double num = 0;
        if (speed >= 1 && speed <= 4) {
            num = base * 1;
        } else if (speed >= 5 && speed <= 8) {
            num =  base * 0.9;
        } else if (speed == 9) {
            num =  base * 0.8;
        } else if (speed == 10) {
            num =  base * 0.77;
        } else {
            return 0;  
        }
            return num ;
        
    }

    public int workingItemsPerMinute(int speed) {
        double perMinute = productionRatePerHour(speed)/ 60 ;
        int perMinuteT = (int) perMinute; 
        return perMinuteT; 
    }
}
