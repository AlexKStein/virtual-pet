package virtual_pet_amok;

public abstract class Organic extends VirtualPet {
    protected int hunger;
    protected boolean clean;
    protected int bathroom;
    public Organic(String name, String type, String noise, int boredom, int energy, int thirst, boolean riot, int hunger, boolean clean, int bathroom) {
        super(name, type, noise, boredom, energy, thirst, riot);
        this.hunger = hunger;
        this.clean = clean;
        this.bathroom = bathroom;
    }
    //getters
    public int getHunger() {
        return hunger;
    }
    public boolean isClean() {
        return clean;
    }
    public int getBathroom() {
        return bathroom;
    }
    //emoji modifiers for status


    @Override
    public void hydrate(){
        System.out.println(getName() + " drinks some water and is less thirsty.");
        thirst -=50;
        bathroom +=15;
        energy += 10;
    }
    public void nap(){
        System.out.println(getName() + "(Zzz...) After a nice nap and a biiiig stretch, they're no longer tired and full of energy again!");
        energy=100;
        bathroom+=25;
    }
    public void cleanRoom(){
        System.out.println(getName() +"'s room and/or litter box is now clean.");
        clean = true;
    }

    @Override
    public void tick() {
        hunger +=10;
        energy -=10;
        bathroom +=10;
        thirst +=10;
    }
}
