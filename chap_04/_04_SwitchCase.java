package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용 -> (( 여러 조건 또는 범위에 해당하는 조건 ))
        int ranking = 1; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");


        // Switch Case 문을 이용 -> (( 명확한 케이스가 있는 경우 ))
        ranking = 1;
        switch (ranking) { // ranking의 값을 case에 해당하는지 확인함
            case 1: // ranking의 값이 1 일때
                System.out.println("전액 장학금");
                break;
            case 2: // ranking의 값이 2 일때
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // case 2 와 case 3을 통합
        ranking = 2;
        switch (ranking) { // ranking의 값을 case에 해당하는지 확인함
            case 1: // ranking의 값이 1 일때
                System.out.println("전액 장학금");
                break;
            case 2: // break가 없기 떄문에 2등이어도 그냥 case3으로 넘어가서 반액 장학금 출력
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고 상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 3; // 등급
        int price = 7000; // 기본 가격
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품의 가격 : 10000원
        // 2등급 제품의 가격 : 9000원

        int score = 95;
        if (score > 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        }
    }
}
