public class EarthVolume {
    public static void main(String[] args){
        double radius=6378;
        double pi=Math.PI;
        double volume=(4/3)*pi*Math.pow(radius,3);
        double volumeMiles = volume * Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volume +
        " and cubic miles is " + volumeMiles);
    }
    
}
