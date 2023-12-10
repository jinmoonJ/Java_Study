package chap_04;
// 주차요금 : 시간당 4000원 (일일 최대요금 : 30000원)
// 경차 or 장애인 차량 최종 요금에서 50% 할인

// 일반 차량 5시간 주차 시 20000원
// 경차 5시간 주차 시 10000원
// 장애인 차량 10시간 주차시 15000원

// 실행 결과 : 주차 요금은 xx 원입니다.
public class _Quiz_04 {
    public static void main(String[] args) {
        int price = 4000;
        int max = 30000;
        boolean basic = true; // true -> 일반 / false -> 장애인 차량
        boolean small = true; // true -> 경차 / false -> 일반
        int time = 8; // 주차 시간
        
        if (basic && !small) {
            System.out.println("일반 차량입니다.");
            if (time * price < max){
                System.out.println("일반차량 주차요금 : " + time * price + "원 입니다.");
            } else {
                System.out.println("일반차량 일일 최대 주차요금 : 30000원 입니다.");
            }
        } else if (small || !basic) {
            System.out.println("특수 차량입니다.");
            if (time * price < max) {
                int specialPrice = time * price / 2;
                System.out.println("경차 또는 장애인차량 주차요금 : " + specialPrice + "원 입니다.");
            } else {
                System.out.println("경차 또는 장애인차량 일일 최대 주차요금 : 15000원 입니다.");
            }
        }
    }
}
