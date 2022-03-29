 class Solution {
    public int XXX(String s) {
        int count = 0 ;
        int i = s.length() - 1;
        // 去掉末尾的空格信息
        while (s.charAt(i) == ' ') {
            i -- ;
        }

        // 避免 末尾 有空格信息
        for (; i >= 0 ; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count ++ ;
        }
        return count ;
    }
}

