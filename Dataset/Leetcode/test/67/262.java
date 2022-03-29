 class Solution {
    public String XXX(String a, String b) {
        //模拟高精度加法
        //先把两个字符串反转
        String x=new StringBuilder(a).reverse().toString();
        String y=new StringBuilder(b).reverse().toString();
        String[] s1=x.split("");
        String[] s2=y.split("");
        StringBuilder sb=new StringBuilder();
        int t=0; //进位
        for(int i=0;i<s1.length || i<s2.length ;i++){
            if(i<s1.length) t += Integer.parseInt(s1[i]); //string转为int
            if(i<s2.length) t += Integer.parseInt(s2[i]);
            sb.append(t%2);
            t /=2 ;
        }
        if(t>0) sb.append(t);
        return sb.reverse().toString(); 
    }
}

