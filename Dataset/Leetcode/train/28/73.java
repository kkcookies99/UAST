 class Solution {
    public int XXX(String haystack, String needle) {
        int l = needle.length();
        for(int i = 0; i < haystack.length() - l + 1; i++){
            if(haystack.substring(i, i+l).equals(needle))
                return i;
        }
        return -1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

