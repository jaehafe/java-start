package java01.ch09.section07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // Button 객체 생성
        Button btnOk = new Button();
        Button btnCancel = new Button();

        // Click Event 처리 객체 설정
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok Button has been clicked");
            }
        });

        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel Button has been clicked");
            }
        });

        // Button 클릭됐을 때
        btnOk.click();
        btnCancel.click();
    }
}
