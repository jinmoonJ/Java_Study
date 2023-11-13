package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        System.out.println("(10분 전) 잠시 후 시작 예정이오니 착석 부탁드립니다.");
        // System.out.println("(5분 전) 잠시 후 시작 예정이오니 착석 부탁드립니다.");
        System.out.println("지금부터 시작하겠습니다.");


        int size = 120;
        System.out.println(size); // 120
        size = size + 10; // 왜 + 10 하는지 다른 사람이 보면 모르니까 주석으로 이유 적어줌(발이 빨리 자라기 떄문에 10 올려서 구매한다)
        System.out.println(size);// 130
        System.out.println("신발 사이즈 " + size + "으로 보여주세요.");

        /*
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        */

        // 한줄 주석 단축키 : ctrl + /
        // 여러 줄 주석 단축키 : ctrl + shift + /
        // (/* */ 주석해도 가능, ctrl + / 주석도 가능, ctrl + shift + / 주석도 가능
    }
}
