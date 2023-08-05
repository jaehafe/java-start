package ch16.section02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        //ok 버튼 객체 생성
        Button btnOk = new Button();

        btnOk.setClickListener(() -> {
            System.out.println("Ok btn has been clicked.");
        });

        //Ok 버튼 클릭하기
        btnOk.click();

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼 객체에 람다식 주입
        btnCancel.setClickListener(() -> {
            System.out.println("Cancel btn has been clicked");
        });

        //Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
