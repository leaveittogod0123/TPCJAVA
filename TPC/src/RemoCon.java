public interface RemoCon { // 객체 생성 X RemoCon = new RemoCon();

    public static final int MAXCH =100; // 객체를 생성하지 않고 메서드나 프로퍼티를 사용하는방법? static! RemoCon.MAXCH
    public static final int MINCH =1; // 객체를 생성하지 않고 메서드나 프로퍼티를 사용하려면 static! 메모리에 바로 올라가잖아!

    public void chUp();
    public abstract void chDown();
    public void internet();
}
// 오직 RemoCon 인터페이스를 구현한 클래스를 통해 사용할 수 있고~ 부모 인터페이스 통해 자식 클래스(구현체)를 사용하게 된다~

