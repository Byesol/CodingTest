import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stagePeople = new int[N + 2]; 
        for (int i = 0; i < stages.length; i++) {
            stagePeople[stages[i]] += 1;
        }
        
        int total = stages.length; 
        HashMap<Integer, Double> failRateMap = new HashMap<>();
        
        for (int i = 1; i <= N; i++) {
            if(total==0){
                failRateMap.put(i,0.0);
            }
            else{
                double failRate = (double) stagePeople[i]/total;
                failRateMap.put(i,failRate);
            }
            total= total - stagePeople[i];
        }
        
        List<Integer> keySet = new ArrayList<>(failRateMap.keySet());
        
        Collections.sort(keySet, (o1, o2) -> {
            int compare = Double.compare(failRateMap.get(o2), failRateMap.get(o1));
            if (compare == 0) {
                return o1.compareTo(o2);
            }
            return compare;
        });
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = keySet.get(i);
        }
        
        return answer;
    }
}