public class TPC23 {
    public static void main(String[] args){

        Dog dog = new Dog();
        display(dog);

        Cat cat = new Cat();
        display(cat);


    }

    private static void display(Animal animal) { // 다형성 인수!
        animal.eat();

        if( animal instanceof Cat){ // instanceof를 통해 구체적인 클래스를 구분할 수 있음!
            ((Cat)animal).night();
        }
    }
}
