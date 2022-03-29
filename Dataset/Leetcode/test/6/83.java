 class Solution {
    public String XXX(String s, int numRows) {
        //边界判断 很重要
        if(s==null||numRows == 1||numRows>s.length()) return s;
        StringBuilder sb = new StringBuilder();
        int k = 2*(numRows - 1); //相邻两个数的最大间隔为k
        int more = k - 2;
        int t = more;    
        for(int i = 0; i < numRows; i++){
            if(i>0&&i<numRows-1)    more = t;
            for(int j = i ;j < s.length();){
                sb.append(s.charAt(j));
                if(i==0||i==numRows-1){           
                    j=j+k;
                    continue;    
                }
                //对中间行进行处理
                j = j + more;
                more = k - more;
            }
            if(i>0&&i<numRows-1)    t = t - 2;
        }
        return sb.toString();
    }
}

