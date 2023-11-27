package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true (다르면 false)

        System.out.println(s2.equals("python")); // false (대소문자 구분을 함)

        // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크 : equalsIgnoreCase()
        System.out.println(s2.equalsIgnoreCase("python")); // true

        // 문자열 비교 심화
        s1 = "1234"; // 벽 메모지 비밀번호 정보 (( 참조 ))
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2 ); // true (참조)

        s1 = new String("1234"); // (new 로 선언하면 참조가 달라짐 -> 새로운 메모지)
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true -> 내용은 같지만
        System.out.println(s1 == s2); // false -> (참조)가 달라짐


    }
}
