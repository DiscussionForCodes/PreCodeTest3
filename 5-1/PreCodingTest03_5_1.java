package 코테;

/**
 * packageName    : 코테
 * fileName       : PreCodingTest03_5_1
 * author         : Hansu
 * date           : 2023-07-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-15        shn81       최초 생성
 */
public class PreCodingTest03_5_1 {
    static int solution1(int n) {
        int count = 1;
        for (int i = 1; i < n; i++) {
            int target = i;
            for (int j = i + 1; j < n; j++) {
                target += j;
                if (target == n) {
                    count++;
                    break;
                } else if (target > n) {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
