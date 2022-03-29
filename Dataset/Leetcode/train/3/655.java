 class Solution {
    public int XXX(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();
        int left = 0,right = 0,res = 0;
        while(right < c.length){
            char ch = c[right];
            right++;
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char d = c[left];
                left++;
                map.put(d,map.get(d)-1);
            }
            res = Math.max(res,right-left);
        }
        return res;
    }
}

