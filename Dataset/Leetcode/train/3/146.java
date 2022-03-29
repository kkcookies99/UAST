 import java.util.HashMap;
import java.util.Map;

class Solution {
    public int XXX(String s) {
        int ans = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            end = i;
            Character cur = s.charAt(i);
            if (map.containsKey(cur)) {
                start = Math.max(start, map.get(cur));
            }
            map.put(cur, i + 1);
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}

