package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이 : length() -> 문자열 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환 : 대문자 -> toUpperCase() , 소문자 -> toLowerCase()
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함 관계 : 포함하는지 안하는지 -> contains("해당단어")
        System.out.println(s.contains("Java")); // 포함된다면 true / 포함되지 않는다면 false
        System.out.println(s.contains("C#"));

        // 위치 정보 : indexOf("해당단어")
        System.out.println(s.indexOf("Java")); // 위치 정보 7
        System.out.println(s.indexOf("C#")); // -1 ,포함되지 않는다면 -1 반환
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치정보 12

        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 위치정보 23
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true (아니면 false)
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true (아니면 false)

    }
}
