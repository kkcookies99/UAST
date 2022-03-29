 class Solution {
    public String XXX(int n) {
        if(n==1)//n==1即为第一行
            return "1";
        String s=XXX(n-1);//接收上一行的递归结果
        StringBuilder sb = new StringBuilder();//创建可变字符序列
        for(int i=0;i<s.length();i++){
            int count=1;//统计当前字符个数
            char c=s.charAt(i);//当前字符
            for(int j=i+1;j<s.length();j++){
                if(c!=s.charAt(j)){
                    break;
                }
                else
                {
                    count++;
                }
            }
            sb.append(count);
            sb.append(c);
            i=(i+count-1);//已统计字符则跳过
        }
        return sb.toString();//返回递归结果
    }

}

