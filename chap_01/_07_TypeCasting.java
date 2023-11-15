package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int score = 93 + 98.8; 연산결과가 double 형이라 안됨

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        // 출력 앞에 괄호에 형변환
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        // 정수 + 실수 연산
        score = 93 + (int) 98.9; // 93 + 98 로 연산한, 소수점 버리고
        System.out.println(score);

        score_d = (double) 93 + 98.9; // double 안해줘도 됨, 자동변환해줌
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score;
        // int -> long -> float -> double (자동으로 형변환됨)

        // int convertedScoreInt = score_d; // 191.9 -> 191 불가능
        int convertedScoreInt = (int)score_d; // (int)로 수동 형변환 해줘야됨

        // 숫자를 문자열로
        // (Class가 제공해주는 기능 사용해야됨, String 클래스의 valueOf 이용
        String s1 = String.valueOf(93);
        // 또는 Integer 클래스의 toString 기능 사용해서 문자열로 넣어줄 수 있음
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // 문자열을 숫자로
        // parse -> 괄호안에 데이터를 파싱해서 변환해줌
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.9");
        System.out.println(d);

        // 파싱할 떄 괄호안의 데이터 형식 잘 맞춰야함
        // int error = Integer.parseInt("자바");

    }
}
