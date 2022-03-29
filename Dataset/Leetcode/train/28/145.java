 class Solution {
    public int XXX(String haystack, String needle) {
         if(needle.length()==0)
            return 0;
        int haystacklen=haystack.length();
        int needlelen=needle.length();
        int location=-1;
        int count=0;
        boolean isfind=true;
        for(int i=0;i<=haystacklen-needlelen;i++){
            if(needle.charAt(0)==haystack.charAt(i)){
                isfind=true;
                count=0;
                for(int j=i;j<i+needlelen;j++){
                    if(needle.charAt(count)!=haystack.charAt(j)){
                        isfind=false;
                        break;
                    }
                    count++;
                }
                if(isfind==true){
                    location=i;
                    break;
                }
            }
        }
        return location;
    }
}

