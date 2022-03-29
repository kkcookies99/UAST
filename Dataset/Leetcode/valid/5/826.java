 class Solution {
    public String XXX(String s) {
        return manacher(s);
    }

    //预处理字符串
    public String expand(String s){
        StringBuilder sb = new StringBuilder();
        sb.append("^#");
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            sb.append('#');
        }
        sb.append('$');
        return sb.toString();
    }

    //马拉车算法
    public String manacher(String s){
        String s1 = expand(s);
        int id = 0;//最大的回文串中心坐标id
        int mx = 0;//回文串右边界的下一个坐标
        int maxLen = 0;//回文串的最大长度
        int start = 0;//原始回文串的位置
        int[] Len = new int[s1.length()];//记录回文串半径
        int n = s1.length();
        for(int i=1;i<n-1;i++){
            if(i<mx) Len[i] = Math.min(Len[2*id-i],mx-i);
            else Len[i] = 1;
            while(s1.charAt(i+Len[i])==s1.charAt(i-Len[i])){
                Len[i]++;
            }
            //更新id和mx
            if(i+Len[i]>mx){
                mx = i+Len[i];
                id = i;
            }
            if(Len[i]-1>maxLen){
                maxLen = Len[i]-1;
                start = (i-Len[i])/2;
            }
        }
        return s.substring(start,start+maxLen);
    }
}

