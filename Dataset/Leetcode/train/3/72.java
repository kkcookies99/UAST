 class Solution {
    public int XXX(String s) {
        Map<Character, Integer>  map = new HashMap();
        int res = 0;
        if(s.length()==0)return res;
        //start、end是滑动窗口的左右侧；窗口始终框着不重复的字符串
        //每滑动一个字符，都会更新res -> 最大子串长度;只是如果当前end指到的字符重复了，就移动start，且只需要将之前的start+1，就变成了不含重复的窗口了
        for(int start = 0, end = 0; end < s.length(); end++){
            char tmp = s.charAt(end);
            if(map.containsKey(tmp)){
                start = Math.max(map.get(tmp)+1, start );
            }
            map.put(tmp, end);
            res = Math.max(end-start+1, res);
        }
        return res;
    }
}

