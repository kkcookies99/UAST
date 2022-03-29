 class Solution {
    public String XXX(int n) {
        //初始化第一个1
        String s = "1";
        //开始循环n-1次
        for(int i=0;i<n-1;i++){
            char[] charS = s.toCharArray();
            StringBuilder result = new StringBuilder();
            int count=0;
            int j = 0;
            for(;j<charS.length;j++){
                if(charS[count]!=charS[j]){
                    result.append(j-count);
                    result.append(charS[count]);
                    count = j;
                }
            }
            //将最后一次内容添加上去
            result.append(j-count);
            result.append(charS[count]);
            s = result.toString();
        }
    return s;
}

