class Solution {
    public String XXX(int n) {
        String res = "1";
       
        int t;
        //n次报数，循环n-1次
        for(int i=1;i<n;i++){
           t=0;
           StringBuilder temp = new StringBuilder();
            //对当前res里每个字符进行遍历，t表当前字符下标
            while(t<res.length()){
                int num=1;
                //数连续且相同的数有几个，计入num
                while((t+1)<res.length()&&res.charAt(t)==res.charAt(t+1))
                {
                    t++;
                    num++;
                }
                //temp最终为为下一个报数生成的值
                temp.append(num).append(res.charAt(t));
                t++;
            }
            //temp赋值res进行下一轮报数
            res = temp.toString();
        }
        return res;
    }
}

