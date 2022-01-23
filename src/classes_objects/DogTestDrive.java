package classes_objects;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog(); // make a Dog object

        d.size = 40; // use the dot operator(.) to set the size of the dog
        d.name = "Kassi";
        d.breed = "BullDog";

        System.out.println("Dog size: " + d.size);
        System.out.println("Dog name: " + d.name);
        System.out.println("Dog Breed: " + d.breed);

        d.bark(); // call its bark() method
    }
}
