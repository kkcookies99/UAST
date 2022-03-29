 class Solution {
    public int XXX(String s) {
        int i = 1,j = 0,len = 0,k = 0;
        char[] c = s.toCharArray();// 将s转换成char数组
        if(c.length < 2){
            return c.length;
        }
        while(i < c.length){
            j = k;// j从k开始
            while(j < i){
                if(c[j] == c[i]){
                    len = Math.max(j-k+1,len);// 更新长度
                    k = j+1;// k更新到当前j的后面
                    break;
                }else{
                    j++;
                }
            }
            len = Math.max(j-k+1,len);// 更新长度
            i++;
        }
        return len;
    }
}

