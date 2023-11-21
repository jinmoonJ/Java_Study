package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        // or 연산 -> ||
        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 true
        // and 연산 -> &&
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 ture

        // And 연산 -> 모두 true여야 true
        System.out.println((5 > 3) && (3 > 1)); // 두 식이 모두 true면 true (true)
        System.out.println((5 > 3) && (3 < 1)); // (false)

        // Or 연산 -> 하나라도 true면 true
        System.out.println((5 > 3) || (3 > 1)); // 5 는 3 보다 크거나 3 이 1 보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // 5 는 4 보다 크거나, 3은 1 보다 작다 (true)
        System.out.println((5 < 3) || (3 < 1)); // 5는 4 보다 작거나, 3은 1보다 작다. (false)

        // System.out.println(1 < 3 < 5); // 불가능한 코드임

        // 논리 부정 연산자 -> 앞에 !
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true

    }
}
