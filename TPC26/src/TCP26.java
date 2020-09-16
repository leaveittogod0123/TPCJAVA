public class TCP26 {
    public static void main(String[] args){
        RemoCon tv = new TV();
        RemoCon radio = new Radio();

        tv.chUp();
        tv.chDown();
        tv.internet();
        tv.chDown();
        tv.chDown();
        tv.chDown();

        radio.chDown();
        radio.chUp();
        radio.internet();
    }
}
