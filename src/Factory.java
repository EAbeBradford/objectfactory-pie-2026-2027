public class Factory {
    public String owner = "Mx. Bradford";
    public int yearFounded = 2026;
    public boolean isOpen = true;
   //donutsOrder1 is an odject of class Donuts
    public Donuts donutsOrder1;
    //todo: make a new Odject of class Donut called donutsOrder2
    //only do the monopoly box creation, dont use constuctor!
    public Donuts donutsOrder2;
    //class -> blueprints
    //object -> is the house


    public static void main(String[] args) {
        Factory f = new Factory();
    }


    //special method: constructor
    //same name as class
    // do not use void
    public Factory (){
        System.out.println("Welcome to Mx. Bradford's Factory");
        System.out.println("the year founded...");
        System.out.println(yearFounded);
        System.out.println("it is " +isOpen+" that the factory is open");

        donutsOrder1 = new Donuts();
        System.out.println(donutsOrder1.numberOfDonuts+" oder 1 #donuts");
        System.out.println(donutsOrder1.frostingType + " is the frosting type");
        System.out.println(donutsOrder1.hasFilling);
        donutsOrder1.numberOfDonuts =  donutsOrder1.numberOfDonuts + 1;
        System.out.println(donutsOrder1.numberOfDonuts +" oder 1 #donuts");

        donutsOrder2 = new Donuts();
        //todo: sout the donutsOrder2 instance vars
        //bonus: give the varibles context
        System.out.println(donutsOrder2.numberOfDonuts);
        System.out.println(donutsOrder2.frostingType + " is the frosting type");
        System.out.println(donutsOrder2.hasFilling);
        donutsOrder2.numberOfDonuts = donutsOrder1.numberOfDonuts * 2;
        System.out.println(donutsOrder2.numberOfDonuts);





    }
}
