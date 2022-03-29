class Solution {
    public int XXX(String s) {
        //去掉首位空格
        s = s.trim();
        if(s.length() == 1){
            return 1;
        }
        int index = -1;
        //从后往前遍历
        for(int i = s.length() - 1; i >=0; i--){
            if(s.charAt(i) == ' '){
                index = i;
                break;
            }
        }

        return s.length() - 1 - index;
    }   
}

