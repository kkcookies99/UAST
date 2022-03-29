 class Solution {
    public int XXX(String s) {
        int left = 0, right = 0, res = 0;
        Map<Character, Integer> window = new HashMap<>();
        while(right < s.length()){
            Character character = s.charAt(right);
            //等于1说明窗口里已经有该字符了
            while (window.getOrDefault(character, 0) >= 1){
                window.put(s.charAt(left++), window.get(s.charAt(left)) - 1);
            }
            window.put(s.charAt(right++), window.getOrDefault(character, 0) + 1);
            res = Math.max(right - left, res);
        }
        return res;
    }
}

