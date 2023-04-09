package src.class15;

public class DogsObject {
    public static void main(String[] args) {

        Dogs bullDog = new Dogs();
        bullDog.breed = "American BullDog";
        bullDog.color = "Black";
        bullDog.look();
        bullDog.size = "big dog";
        bullDog.age = "5";
        bullDog.eating();
        bullDog.bark();
        bullDog.sleep();


        Dogs grandHunt = new Dogs();
        grandHunt.breed ="Afghan Grand hunt";
        grandHunt.size = "Tall";
        grandHunt.color = "White";
        grandHunt.age = "10";
        grandHunt.look();
    }
}
