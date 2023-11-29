package chap_03;
// "980101-1234567" 인 경우 980101-1 까지 출력
// "020113-4567890" 인 경우 020113-4 까지 출력
public class _Quiz_03 {
    public static void main(String[] args) {
        String regiNo = "980101-1234567";

        System.out.println(regiNo.substring(0,8));

        regiNo = "020113-4567890";
        // 0 위치부터 "-" 위치 +2 직전까지
        System.out.println(regiNo.substring(0,regiNo.indexOf("-") + 2));



    }
}
