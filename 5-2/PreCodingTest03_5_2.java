package 코테;

/**
 * packageName    : 코테
 * fileName       : PreCodingTest03_5_2
 * author         : Hansu
 * date           : 2023-07-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-15        shn81       최초 생성
 */
public class PreCodingTest03_5_2 {
    static int solution2(int N, int K) {
        int max = Integer.MIN_VALUE;
        boolean isMinus = N < 0 ? true : false;
        String number = Integer.toString(N);
        int i = isMinus ? 1 : 0;
        for (; i < number.length(); i++) {
            StringBuilder tmp = new StringBuilder(number);
            tmp.insert(i, K);
            max = Math.max(max, Integer.parseInt(tmp.toString()));
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
