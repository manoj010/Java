public class Dog implements Animal, Alien {
    String name = "dog";
    String species = "mammal";
    String planet = "Keplar";
    @Override
    public void name() {
        System.out.println("What the " + name + " doin!!");
    }
    @Override
    public void species() {
        System.out.println("I am a " + species + ".");
    }
    @Override
    public void planet() {
        System.out.println("I am a from " + planet + ".");
    }
}
