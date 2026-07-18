class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        
       boolean knightIsAsleep = !knightIsAwake; 
        return knightIsAsleep ;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
       boolean awake = knightIsAwake ||archerIsAwake|| prisonerIsAwake ;
           return awake; 
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean signal = !archerIsAwake && prisonerIsAwake;
        return signal; 
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean         prisonerIsAwake, boolean petDogIsPresent) {
        boolean freePrisoner = (petDogIsPresent && !archerIsAwake) || (!petDogIsPresent && !archerIsAwake && !knightIsAwake && prisonerIsAwake);
        return freePrisoner ;
    }
}
