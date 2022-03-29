class Solution {
    public boolean XXX(int x) {
        if(x < 0)
            return false;
        
        char[] ch = Integer.toString(x).toCharArray();
        int tmp = ch.length - 1;
        for(int i = 0; i <= ch.length / 2; i++){
            if(ch[i] != ch[tmp])
                return false;
            else
                tmp--;
        }
         return true;   
    }
}

