 class Solution {
    public int XXX(String s) {
        if (s.length() == 0|| s == null) {
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        int max = 0;
        Set set = new HashSet<String>();
        int start = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (set.contains(s.charAt(i))) {
                if (set.size() > max) {
                    max = set.size();
                }
                // 这里从k = j-1开始移除，是因为s在i上的字符与s在j上字符是一样的， 省去一次弹入弹出
                for (int j = i - 1; j >= start; j--) {
                    if (s.charAt(j) == s.charAt(i)) {
                        for (int k = j-1; k >= start; k--) {
                            set.remove(s.charAt(k));
                        }
                        // 修改窗口的起始位置
                        start = j+1;
                        break;
                    }
                }
            }else{
                // set中没有相同的元素则添加元素到set中。
                set.add(s.charAt(i));
            }
        }
        if(set.size() > max){
            max = set.size();
        }
        return max;
    }
}

