class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0, score2 = 0, score3 = 0;
        int idx1 = 0, idx2 = 0, idx3 = 0; 
        
        for (int ans : answers) {
            if (ans == p1[idx1]) score1++;
            if (ans == p2[idx2]) score2++;
            if (ans == p3[idx3]) score3++;
            
            idx1++;
            idx2++;
            idx3++;
            
            if (idx1 == 5) idx1 = 0;
            if (idx2 == 8) idx2 = 0;
            if (idx3 == 10) idx3 = 0;
        }
        
        // 4. 제일 높은 점수 찾기
        int maxScore = Math.max(score1, Math.max(score2, score3));
        
        // 5. 1등이 몇 명인지 세기 (배열의 크기를 정하기 위해)
        int count = 0;
        if (maxScore == score1) count++;
        if (maxScore == score2) count++;
        if (maxScore == score3) count++;
        
        int[] result = new int[count];
        int resultIdx = 0;
        
        if (maxScore == score1) {
            result[resultIdx] = 1;
            resultIdx++;
        }
        if (maxScore == score2) {
            result[resultIdx] = 2;
            resultIdx++;
        }
        if (maxScore == score3) {
            result[resultIdx] = 3;
            resultIdx++;
        }
        
        return result;
    }
}