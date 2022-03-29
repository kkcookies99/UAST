 class Solution {
    public String XXX(String s) {
        if(s.length() < 2)
            return s;
    
        char[] chArr = manacherString(s);
        int[] pArr = new int[chArr.length];//回文半径数组
        //R 最右回文边界
        //C 中心位置
        int R = -1, C = -1;

        int max = -1;
        int maxEnd = -1;//回文长度取max时的右边界
        for(int i = 0; i < chArr.length; i++){
            //i至少不用验的区域
            pArr[i] = R > i ? Math.min(pArr[2*C-i], R-i) : 1;

            while(i+pArr[i] < chArr.length && i-pArr[i] > -1)
            {
                //跳过至少不用验的区域还能往两边扩多少
                if(chArr[i+pArr[i]] == chArr[i-pArr[i]])
                    pArr[i]++;
                else
                    break;
            }
            //更新R和C
            if(i+pArr[i] > R){
                R = i+pArr[i];
                C = i;
            }
            //更新max
            if(pArr[i] > max){
                max = pArr[i];
                maxEnd = R;//记录取得最大回文长度时的右边界
            }
        }

        return s.substring((maxEnd>>1)-max+1, maxEnd>>1);
    }

    // abc -> #a#b#c#
    public char[] manacherString(String s){
        char[] res = new char[s.length()*2+1];
        int index = 0;
        for(int i = 0; i < res.length; i++){
            res[i] = (i & 1) == 0 ? '#' : s.charAt(index++);
        }
        return res;
    }
}

