 class Solution {
    public int XXX(String haystack, String needle) {
        int len = needle.length();
        if(len == 0){
            return 0;
        }
        for(int i = 0; i <= haystack.length()-len; i ++){
            if((haystack.substring(i,i+len)).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


