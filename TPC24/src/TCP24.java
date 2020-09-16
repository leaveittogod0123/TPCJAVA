public class TCP24 {
    public static void main(String[] args) {
        // Dog, Cat 등 구체적인 클래스를 저장할 배열을 만드시오!

        Animal[] animal = new Animal[2]; // 서로 다른타입이 부모클래스를 통해 같이쓰일 수 있음~
        // 중요한건 Animal의 클래스가 Object 잖아요~ Object로 쓰기 전에 이렇게 해보는 것
        animal[0] = new Dog();
        animal[1] = new Cat();

        for(int i = 0; i< 2; i++ ){
            animal[i].eat();
            if( animal[i] instanceof Cat){
                ((Cat)animal[i]).night();
            }
        }

        display(animal);

    }

    private static void display(Animal[] animal) { // 다형성배열
        for(int i = 0; i< 2; i++ ){
            animal[i].eat();
            if( animal[i] instanceof Cat){
                ((Cat)animal[i]).night();
            }
        }

    }
}
