class Solution {
    public String XXX(int n) {
        return count("1", 1, n);
    }
    
    /**
        current 数字i表示的报数字符串
        i 当前数字
        j 就是n
    */
    public String count(String current, int i, int j) {
        if (i == j) return current;
        if (i == 1) return count("11", ++i, j);
        
        char a = current.charAt(0);
        int num = 1;
        StringBuilder s = new StringBuilder();
        for (int k = 1; k < current.length(); k++) {
            if (a != current.charAt(k)) {
                // 找到不相同的字符
                s.append(num);
                s.append(a);
                num = 1;
                a = current.charAt(k);
                continue;
            }
            num ++;
        }
        
        s.append(num);
        s.append(a);
        return count(s.toString(), ++i, j);
    }
}

