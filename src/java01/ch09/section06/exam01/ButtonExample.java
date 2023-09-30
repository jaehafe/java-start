package java01.ch09.section06.exam01;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        // 구현 클래스
        class OkListener implements Button.ClickListener {
            // 구현 메서드 재정의
            @Override
            public void onClick() {
                System.out.println("Ok button has been clicked");
            }
        }

        btnOk.setClickListener(new OkListener());
        btnOk.click();

        System.out.println("----------------");

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel button has been clicked");
            }
        }

        btnOk.setClickListener(new CancelListener());
        btnOk.click();
    }
}
