public class Dog2 extends AbstractAnimal {
    // 상태정보
    // 행위정보
    public Dog2(){
        super(); // new Animal();
    }
    // 재정의
    public void eat(){
        System.out.println("개처럼 먹음.");
    }

}
