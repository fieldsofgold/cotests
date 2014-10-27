/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotests;

/**
 *
 * @author Gawronek
 */
public class Four {
    public static int solution(int[] A) {
        int result = 1;
        int tempResult = 1;
        int indexReuslt = 0;
        for (int i = 1; i < A.length; i++) {

            if (A[i - 1] < A[i]) {
                tempResult++;
            } else {
                tempResult = 1;
            }
            if (result < tempResult) {
                result = tempResult;
                indexReuslt = i - result + 1;

            }

        }

        return indexReuslt;
    }
}
