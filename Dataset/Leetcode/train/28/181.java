 class Solution {
    public int XXX(String haystack, String needle) {
        int i =0;
        if (haystack.length()>0&&needle.length()>0){
            String s=haystack.replace(needle," ");
            while (i<s.length()){
                if (String.valueOf(s.charAt(i)).equals(" ")){
                    break;
                }
                i++;
                if (i==s.length()){
                    i=-1;
                    break;
                }
            }
        }else if (haystack.length()==0&&needle.length()>0){
            i=-1;
        }
        return i;
    }
}