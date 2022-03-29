class Solution {
    public String XXX(int n) {
        //初始化
        String str = "1";
        StringBuffer sb = new StringBuffer();
        for(int i = 2;i <= n; i++){
            char[] c = str.toCharArray();
            for(int j = 0;j < c.length; j++){
                //计数初始为1
                int count = 1;
                //前后数一样，count++
                while(j + 1 < c.length && c[j] == c[j + 1]){
                    count++;
                    j++;
                }
                //count个c[j]
                sb.append(count);
                sb.append(c[j]);
            }
            //赋值，进行下一循环
            str = sb.toString();
            sb.delete(0,sb.length());
        }
        return str;
    }
}

