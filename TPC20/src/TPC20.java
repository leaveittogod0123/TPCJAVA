public class TPC20 {
    public static void main(String[] args) {
        Animal dog = new Dog(); // 보통 남이 만든 클래스를 생성해서 쓰기 때문에 부모를 가지고 자식 클래스의 메서드를 사용하는 방법으로 구현한다~

        dog.eat(); // 부모 클래스 eat을 씀. 그래서 재정의해야

        Animal cat = new Cat(); // Cat의 동작방식을 몰라 Animal의 메서드를 통해 Cat의 클래스의 메서드를 사용할 수 있다는 점~ 이게 포인트
        cat.eat(); // 재정의된 메서드를 통해 Cat 클래스의 메서드를 실행하게 됌

        //cat.night(); // 부모 클래스에 없는 메서드는 자식클래스에 있어도 접근이 안됌
        ((Cat)cat).night(); // 다운캐스팅해줘야 가능함.
    }
}
