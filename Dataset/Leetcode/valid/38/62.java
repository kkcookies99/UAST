class Solution {
    public String XXX(int n) {
        String s="1";
        if(n==1)
           return s;
        for(int i=2;i<=n;i++)
        {
            StringBuilder str=new StringBuilder();
            char pre=s.charAt(0);     //取第一个字符作为初始判断
            int count=1;
            for(int j=1;j<s.length();j++)
            {
                if(s.charAt(j)==pre)
                   count++;         //相等即增加改数字数量
                else{
                    str.append(count).append(pre); //不相等的话字符串增加数字和个数
                    pre=s.charAt(j);       ////修改初始判断为不同的数字
                    count=1;                //数目重新为1 
                }
            }
            str.append(count).append(pre);  //将最后重复的数字和数量添加
            s=str.toString();
        }
        return s;

    }
}

