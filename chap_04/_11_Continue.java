package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 판매 수량
        int sold = 0; // 현재 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼 손님
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 아래 코드로 가지 않고 바로 다음 반복으로 돌아감 (다음 회차로)
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break; // 반복문 탈출
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("===================");

        // While 문
        int index = 1; // 손님 번호
        sold = 0;
        // while (index < 50) {
        // index++;           -> 이렇게 하면 if 안에서 index 증가르 안시켜도 가능
        // while (true) { -> 아래에 max라는 종료 조건이 있기 때문에 이럴떈 무한 반복 해도 됨
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면 (noShow)
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                index++; // while 에선 자동 증감 안되기 떄문에 다음 반복 가기전에 ++해줌
                continue;
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
