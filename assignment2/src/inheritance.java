
class Animal{
    void eat(){
        System.out.println("this animal is eating ");
    }
}

class Dog extends Animal {
    void bark (){
        System.out.println("the dog is barking");
    }
}

 class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog ();
        dog.bark();

    }
}