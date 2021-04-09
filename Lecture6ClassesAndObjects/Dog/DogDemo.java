package by.jrr.HomeWork.Lecture6ObjectsAndClasses.Dog;

public class DogDemo {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Джесси",3,"Черная");
        Dog dog2 = new Dog("Рекс",5,"Белый");
        Dog dog3 = new Dog("Мухтар",10,"Коричневый");
        System.out.println(dog1);
        dog1.voice();
        System.out.println(dog2);
        dog2.sleep();
        System.out.println(dog3);
        dog3.eat();
    }
}
