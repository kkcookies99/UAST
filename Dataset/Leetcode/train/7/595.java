 class Solution {
    public int XXX(int x) {

        // 判断正负
        boolean flag = true;
        if(x < 0){
            flag = false;
            x = -x;
        }

        // 双指针反转
        String xStr = String.valueOf(x);
        char[] c = xStr.toCharArray();
        char temp = 0;
        for(int l = 0 , r = c.length -1 ; l < r ; l++,r--){
            temp = c[r];
            c[r] = c[l];
            c[l] = temp;
        }

        // 溢出判断
        try{
            x = Integer.valueOf(String.valueOf(c));
        }catch(Exception e){
            return 0;
        }
        
        // 正负符号
        return flag?x:-x;
    }
}

