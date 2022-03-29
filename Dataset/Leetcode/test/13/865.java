 class Solution {
    public int XXX(String s) {
        int[] map = new int[256];
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;
        char[] chars = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < chars.length; ++i) {
            if (i + 1 < chars.length && map[s.charAt(i + 1)] > map[s.charAt(i)]) {
                ans += map[s.charAt(i + 1)] - map[s.charAt(i)];
                ++i;
            } else {
                ans += map[s.charAt(i)];
            }
        }
        return ans;
    }
}

