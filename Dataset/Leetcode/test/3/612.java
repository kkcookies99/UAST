 class Solution {
    public int XXX(String s) {
        int max = 0;
        int temp = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                i = map.get(s.charAt(i)) + 1;
                if (s.length() - 1 - i < max) {
                    return max;
                }
                map.clear();
                temp = 0;
            }
            map.put(s.charAt(i), i);
            temp++;
            if(temp==s.length()){
                return temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}

