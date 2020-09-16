public class TV implements RemoCon {
    private int ch = 1;
    @Override
    public void chUp() {

        this.ch += 1;
        System.out.println("TV 채널 올라감");
    }

    @Override
    public void chDown() {
        if( RemoCon.MINCH > this.ch){
            System.out.println("채널 더이상 못내려");
            return;
        }
        this.ch -=1;
        System.out.println("TV 채널 내려감");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 기능을 사용함");
    }
}
