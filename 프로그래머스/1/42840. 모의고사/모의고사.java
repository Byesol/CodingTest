class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        int index1 = 0; 
        int index2 = 0; 
        int index3 = 0; 
        
        for (int ans : answers) {
            if (ans == p1[index1]) {
                score1++;
            }
            if (ans == p2[index2]) {
                score2++;
            }
            if (ans == p3[index3]) {
                score3++;
            }
            
            index1++;
            index2++;
            index3++;
            
            if (index1 == 5) {
                index1 = 0;
            }
            if (index2 == 8) {
                index2 = 0;
            }
            if (index3 == 10) {
                index3 = 0;
            }
        }
        
        int maxScore = Math.max(score1, Math.max(score2, score3));
        
        int count = 0;
        if (maxScore == score1) {
            count++;
        }
        if (maxScore == score2) {
            count++;
        }
        if (maxScore == score3) {
            count++;
        }
        
        int[] result = new int[count];
        int resultIndex = 0;
        
        if (maxScore == score1) {
            result[resultIndex] = 1;
            resultIndex++;
        }
        if (maxScore == score2) {
            result[resultIndex] = 2;
            resultIndex++;
        }
        if (maxScore == score3) {
            result[resultIndex] = 3;
            resultIndex++;
        }
        
        return result;
    }
}
