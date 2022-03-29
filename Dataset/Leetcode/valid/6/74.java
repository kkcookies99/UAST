 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1)
            return s;
        int i=0,poor=2*numRows-2,len=s.length();//观察示例给出的Z形可以发现每个循环中间行都比收尾行多出一个
        StringBuffer sb=new StringBuffer();
        while(i<len){//首行
            sb.append(s.charAt(i));
            i+=poor;
        }
        for(int j=1;j<numRows-1;j++){//中间行
            i=0;
            while(i<len){
                int n=i+j;
                if(n<len)
                    sb.append(s.charAt(n));
                i+=poor;
                n=i-j;
                if(n<len)
                    sb.append(s.charAt(n));
            }

        }
        i=numRows-1;
        while(i<len){//尾行
            sb.append(s.charAt(i));
            i+=poor;
        }
        return sb.toString();
    }
}

