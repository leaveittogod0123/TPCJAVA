public class TPC19 {
    public static void main(String[] args){
//        Dog dog = new Dog();
//        dog.eat();
//
//        Cat cat = new Cat();
//        cat.eat();

        // 남이 만든 클래스를 사용해야한다면 ?
        // 객체 찍고 dot만 눌러도 메서드 나오잖아.

        // .java 소스파일은 보통 안주잖아요. 그래서 interface~
        // 스프링에서는 repository를 interface를 쓰잖아. 구현체만 바뀌면 데이터베이스 자체가 바뀌니까 변동포인트 줄지~

        // 어떤 클래스를 만들때 원 소스 파일은 제공안하고, 인터페이스도 같이 제작해서 배포하면~
        // 사용할 수가 있죠. 그때 상속을 이용합니다.

        // Animal이란 부모클래스를 만들었고, Cat, Dog 클래스는 각각 부모클래스를 상속받음.
        // Animal이란 부모클래스를 통해 Cat, Dog 클래스를 사용할 수 있게 됌.


        // 상속 -> 메모리 부모클래스, 자식클래스 각각 존재하고, 자식클래스는 부모클래스의 자원을 사용할 수 있는 범위가 늘어나게 되는 것임.
        // 자식이 부모 클래스의 기능을 사용할 수 있다~
        Animal dog2 = new Dog();
        dog2.eat();

        Animal cat2 = new Cat();
        cat2.eat();

    }
}
