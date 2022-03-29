class Solution {
    public int XXX(String s) {
        String regex="\\s";
        if(s.trim().length()==0){ return 0; }
        String []an= s.split(regex);
        return an[an.length-1].length();
    }
}

