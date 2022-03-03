public class UnitConverter {
    public UnitConverter(){

    }
    public int distance_converter(int km){
        double miles = km*1.6;
        return(int)miles;
        //return 0;
    }
    public int weight_converter(int kg){
        double pound = 2.2*kg;
        return (int)pound;
        //return 0;
    }
    public int temperature_converter(int centi){
        double fahrenheit = (centi*1.8)+32;
        return(int)fahrenheit;
        //return 0;
    }
    public int volume_converter(int it){
        double gallons = it/3.78541;
        return (int)gallons;
        //return 0;
    }
}
