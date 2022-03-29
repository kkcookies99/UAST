 class Solution {
    public boolean XXX(String s) {
        if(" ".equals(s))
            return true;
        String str = s.trim().replaceAll("\\.|@|#|,|:|_|\\s*", "").toLowerCase();

        if(str.length() <= 1)
           return true;

        int i = (str.length()-1) / 2;//定位到上中点
        return expandArroundCenter(str, i, i)//一个点向两边扩散
            || expandArroundCenter(str, i, i+1);//两个点向两边扩散
    }
    
    public boolean expandArroundCenter(String str, int i, int j){
        while(i >= 0 && j < str.length() )
        {
            if( str.charAt(i) != str.charAt(j) )
                return false;
            i--;
            j++;
        }
        return i < 0 && j >= str.length();
    }
}

