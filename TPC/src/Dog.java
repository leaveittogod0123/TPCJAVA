public class Dog extends Animal {
    // 상태정보
    // 행위정보
    public Dog(){
        super(); // new Animal();
    }
    // 재정의
    public void eat(){
        System.out.println("개처럼 먹음.");
    }

}
