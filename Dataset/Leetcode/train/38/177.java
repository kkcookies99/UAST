class Solution {
    public String XXX(int n) {
        //如果n=1的时候，直接输出1
        if(n==1) return "1";
        //大于一的时候，先定义一个数组且第一个为1
        String s="1";
        for(int i=2;i<=n;i++){
            //定义一个stringbuilder用来拼接字符
            StringBuilder str=new StringBuilder();
            //将string的转成一个个字符
            char[] a=s.toCharArray();
            //定义一开始数字为一
            int count=1;
            //进入循环，记得这个只能添加到倒数第二个字符
            for(int j=1;j<a.length;j++){
                if(a[j]==a[j-1]){
                    count++;
                }else{
                str.append(count);
                str.append(a[j-1]);
                count=1;
                }    
            } 
            //在这里还添加最后一个字符，反正是1
                str.append(count);
                str.append(1);
                //转成string类型进入第二次循环
                s=str.toString();
        }
        return s;
    }
}

