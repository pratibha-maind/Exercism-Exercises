public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int a){
        return (40-a);
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int l){
        return (2*l);
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int l , int a)
    {
        return (2*l)+a;
    }
}
