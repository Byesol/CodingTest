import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String dirs) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;

        for (char c : dirs.toCharArray()) {
            int nx = x, ny = y;

            if (c == 'U'){
                ny += 1;
            }
            
            else if (c == 'D'){
                ny -= 1;
            } 
            else if (c == 'R'){
                nx += 1;
            } 
            else if (c == 'L'){
                nx -= 1;
            } 

            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }

            String path = makePath(x, y, nx, ny);

            visited.add(path);

            x = nx;
            y = ny;
        }

        return visited.size();
    }

    private String makePath(int x1, int y1, int x2, int y2) {
        // 더 작은 점이 더 앞에
        if (x1 < x2 || (x1 == x2 && y1 < y2)) {
            return x1 + "," + y1 + " " + x2 + "," + y2;
        } else {
            return x2 + "," + y2 + " " + x1 + "," + y1;
        }
    }
}