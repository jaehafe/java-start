package java01.ch16.section02.exam02;

public class Button {
    //정적 멤버 interface
    @FunctionalInterface
    public static interface ClickListener {
        //추상 메서드
        void onClick();
    }

    //필드
    private ClickListener clickListener;

    //메서드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
