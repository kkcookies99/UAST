 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1) return s;
        StringBuffer sb = new StringBuffer();
        int limit = s.length();//字符串长度
        int ceil = 0,floor = numRows-1,gap = 2*numRows-2;//最小的行数,最大的行数,最顶行最底行的间隙
        //最顶行的字符
        for(int i=0;(ceil+i*gap)<limit;i++)
            sb.append(s.charAt(ceil+i*gap));
        for(int i=1;i<numRows-1;i++){
            int idx = i;
            while(idx<limit){
                sb.append(s.charAt(idx));
                idx += 2*(floor-i);
                if(idx<limit)
                    sb.append(s.charAt(idx));
                idx += 2*(i-ceil);
            }
        }
        //最低行的字符
        for(int i=0;(floor+i*gap)<limit;i++)
            sb.append(s.charAt(floor+i*gap));
        return sb.toString();
    }
}

