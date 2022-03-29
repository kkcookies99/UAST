 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        int i=0,j=0;
        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(i+needle.length()>haystack.length()) return -1;
                for(int n=0;n<needle.length();n++){
                    if(haystack.charAt(i + n) != needle.charAt(n)){
                        j=0;
                        break;
                    }
                    j++;
                }
                if(j == needle.length()){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


