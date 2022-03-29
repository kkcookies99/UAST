 class Solution {
    public int XXX(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int max = 0;
        int slow = 0;
        for (int i = 0; i < n; i++) {
            if(map.containsKey(s.charAt(i))){
                slow = Math.max(slow,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max,i-slow+1);
        }
        return max;
    }
}

