class Solution {
    public String XXX(int n) {
        String[] str = new String[n];
        str[0] = "1";
        if(n == 1){
            return str[0];
        }
        str[1] = "11";
        for(int i = 2; i < n; i++){
            int left = 0, right = 0;
            StringBuilder s = new StringBuilder();   
            char[] chs = str[i - 1].toCharArray(); 
            while(right < chs.length){
                if(chs[left] == chs[right]){
                    right++;
                }else{
                    s.append(right - left).append(chs[left]);
                    left = right;
                }
            }
            s.append(right - left).append(chs[left]);
            str[i] = s.toString();
        }
        return str[n - 1];
    }
}

