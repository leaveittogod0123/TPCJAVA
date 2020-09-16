public class Radio implements RemoCon{

    @Override
    public void chUp() {
        System.out.println("라디오 채널을 높임");
    }

    @Override
    public void chDown() {
        System.out.println("라디오 채널을 낮춤");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 지원되지 않음");
    }
}
