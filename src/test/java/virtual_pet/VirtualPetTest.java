package virtual_pet;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class VirtualPetTest {
//    @Test
//    public void hungerShouldDecreaseBy50andSleepinessIncreaseBy25() {
//        //Assignment
//        VirtualPet underTest = new VirtualPet ("Frodo", 100,  "dog", 0,0, false );
//        //Action
//        underTest.feedPet();
//        //Assertion
//        assertEquals(25, underTest.getHunger());
//        assertEquals(25, underTest.getSleepiness());
//    }
//    @Test
//    public void sleepinessShouldBeHigherAndBoredomLower() {
//        //Assignment
//        VirtualPet underTest = new VirtualPet("Frodo", 0,  "dog", 25, 50, false);
//        //Action
//        underTest.play();
//        //Assertion
//        assertEquals(70, underTest.getSleepiness());
//        assertEquals(15, underTest.getBoredom());
//    }
//    @Test
//    public void sleepinessShouldBeResetAndBoredomUpTen() {
//        //Assignment
//        VirtualPet underTest = new VirtualPet("Frodo", 0, "dog", 85, 0, false);
//        //Action
//        underTest.nap();
//        //Assertion
//        assertEquals(0, underTest.getSleepiness());
//        assertTrue(underTest.getBoredom()>1);
//    }
//    @Test
//    public void hungerAndSleepinessShouldIncrease() {
//        VirtualPet underTest = new VirtualPet("Frodo", 1, "dog", 1, 0, false);
//        underTest.tick();
//        assertTrue(underTest.getHunger() >1);
//        assertTrue(underTest.getSleepiness() >1);
//        assertTrue(underTest.getBoredom() >1);
//    }
    @Test
    public void petShouldBeAddedWhenAdmitted(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admit(new VirtualPet("Frodo", 1, "dog", 1, 0, false));
        assertEquals("Frodo U*ᴥ*U", underTest.getPetShelter().get(0).getName());
    }
    @Test
    public void petShouldBeRemovedAfterAdoptPet(){
        //assignments
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admit(new VirtualPet("Frodo", 1, "dog", 1, 0, false));
        underTest.admit(new VirtualPet("adoptTest", 1, "dog", 1, 0, false));
        underTest.admit(new VirtualPet("Korra", 1, "dog", 1, 0, false));
        //action
        underTest.adoptPet(2);
        assertTrue(underTest.getPetShelter().size() < 3);

    }
}
