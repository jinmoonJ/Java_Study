package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문 순회 -> 특정 인덱스 사용할 때
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");

        System.out.println("=============배열.length");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");

        System.out.println("===============for-each(enhanced for)");

        // enhanced for (for-each) 반복문 -> 배열 모두를 순회하면서 작업할때 사용

//        for (String coffee :
//                coffees) {
//            System.out.println(coffee + " 하나");
//        }
//        System.out.println("주세요.");
        for (String coffee : coffees) { // coffees라는 배열의 값을 순회하는데 coffee라는 이름으로 받아서 사용하겠다.
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요.");
    }
}
