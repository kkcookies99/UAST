 class Solution {
    public int XXX(String s) {
        char[] ss = s.toCharArray();
        int count = 0;
        for(int i = ss.length-1; i >= 0; --i){
            if(ss[i] == ' '){
                if(count == 0)
                    continue;
                else
                    break;
            }else
                count++;
        }
        return count;
    }
}

