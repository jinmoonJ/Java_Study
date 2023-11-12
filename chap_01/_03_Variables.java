package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "JM";
        // String name = "JM"; 같음
        int hour = 15;
        System.out.println(name + "님, 배송이 시작 됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        // String(문자열은 "), char(문자는 ')
        name = "강백호"; // name 업데이트 -> 변수 업데이트를 통해 위에선 JM 업데이트 후엔 강백호 출력
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("시험 합격 여부 : " + pass);

        double d = 3.14123456789; // 실수 값 그대로 넣어줘도 됨
        float f = 3.14123456789f; // float 값 선언에선 뒤에 f/F 붙여줘야함
        // float는 3.14123456 까지 출력 됨 -> 정밀한 소수 계산에는 double 사용
        System.out.println(d);
        System.out.println(f);
        // double -> 정밀한 소수점 그게 아니면 float

        // int i = 1000000000000; int 값 범위 넘어간 것 -> +-21억까지
        long l = 1000000000000L; // L 붙여줘야함
        l = 1_000_000_000_000L; // _넣어서 가독성 높일 수 있음
        System.out.println(l);

    }
}
