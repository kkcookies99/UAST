 class Solution {
    public int XXX(String s) {
        String[] strarr=s.split(" ");
        if(strarr.length==0) return 0;
        else
            return strarr[strarr.length-1].length();
    }
}

