 class Solution {
    public int XXX(String s) {
        // left, right分别对应window的左右边界,max是window的长度
        int left = 0, right = 0, n = s.length(), max = 0;
        char[] ss = s.toCharArray();
        Set<Character> filter = new HashSet<>();
        while ( left < n ) {
            right = left ;
            filter.clear();
            while ( right < n ) {
                // 如果有重复的，退出本层
                if ( !filter.add(ss[right]) ) {
                    break;
                }
                right ++;
            }
            max = Math.max(filter.size(), max);
            left ++;
        }
        return max;
    }
}

