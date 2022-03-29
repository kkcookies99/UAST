 class Solution {
    public static String XXX(String s) {
        if(s == null || s.length() == 0){
            return null;
        }
        int[] res = maxLcpsLength(s);
        return s.substring(res[1]-res[0]/2,res[1]-res[0]/2+res[0]);


    }
    public static int[] maxLcpsLength(String str) {
        char[] ch = toProcessArray(str);
        int C = -1;
        int R = -1;
        int[] pArr = new int[ch.length];
        int[] res = new int[]{Integer.MIN_VALUE,-1};
        for(int i = 0; i < ch.length;i++){
            //不用判断的位置
            pArr[i] = R > i?Math.min(R-i,pArr[2*C - i]):1;
            while(i + pArr[i] < pArr.length && i-pArr[i] > -1){
                if (ch[i + pArr[i]] == ch[i - pArr[i]])
                    pArr[i]++;
                else {
                    break;
                }
            }
            if(i + pArr[i] > R){
                R = i+ pArr[i];
                C = i;
            }
            if(pArr[i] > res[0]){
                res[0] = pArr[i]-1;
                res[1] = i/2;
            }
        }
        return res;
    }

    public static char[] toProcessArray(String s){
        char[] c = s.toCharArray();
        char[] res = new char[2*c.length+1];
        int j = 0;
        for(int i = 0;i < res.length;i++){
            res[i] = i % 2 == 0?'#':c[j++];
        }
        return res;
    }
}

