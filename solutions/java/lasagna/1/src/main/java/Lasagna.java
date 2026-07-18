public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int x = 40 ;
        return x ;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven){
       int x = expectedMinutesInOven() - actualMinutesInOven;
        return x ;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberLayers){
        int x = numberLayers * 2; 
        return x; 
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int addedLayers, int ovenMinutes){
        int x = preparationTimeInMinutes(addedLayers) + ovenMinutes;
        return x;
    }
}
