 class Solution {
    public int XXX(String s) {
        s=s.trim();
        if(s==null ||s.length()==0) return 0;
        String[] str = s.split(" ");
        return str[str.length-1].length();

    }
}



