 class Solution {
    public int XXX(String s) {
        char[] ss = s.toCharArray();
        int[] map = new int[256];
        int res = 0;
        for(int i = 0, j = 0; i < ss.length && j < ss.length;){
            while(j < ss.length && map[ss[j]] == 0){
                ++map[ss[j++]];
            }
            res = res > j - i ? res : j - i;
            while(j < ss.length && map[ss[j]] > 0){
                --map[ss[i++]];
            }
        }
        return res;
    }
}

