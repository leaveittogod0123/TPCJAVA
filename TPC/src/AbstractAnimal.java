public abstract class AbstractAnimal { // 추상클래스 ( 불완전한 ) AbstractAnimal animal = new AbstractAnimal(); X
    // 이렇게 하면 자식 클래스에서 eat 메서드를 재정의를 강제할 수 있음! 결국 이 클래스는 담는 그릇일 뿐 직접 사용할 필요는 없음. 오직 재정의 강제를 위함
    public abstract void eat(); // 불완전한 메서드

    public void move() {
        System.out.println("무리를 지어서 이동함");
    }
}
