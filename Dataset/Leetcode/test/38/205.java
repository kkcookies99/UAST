class Solution {
    public String XXX(int n) {
        if(n == 1){
            return "1";
        }
        // 加一个空格方便处理
        String str = "1 ";
        for(int i = 1; i < n; i++){
            int start = 0; // 当前这个字符起始位置
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < str.length(); j++){
                // 如果下一个字符与当前字符不相同，添加统计的字符数量
                if(j > 0 && str.charAt(j - 1) != str.charAt(j)){
                    int count = j - start;
                    sb.append(String.valueOf(count)).append(str.charAt(j - 1));
                    start = j;
                }
            }
            str = sb.toString() + " ";
        }
        return str.trim();
    }
}

