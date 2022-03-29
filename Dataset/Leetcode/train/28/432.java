 class Solution {
    public int XXX(String haystack, String needle) {

        if (needle.equals("")) return 0;
        if (haystack.equals("")) return -1;
        if (haystack.length()<needle.length()) return -1;
        char[] charSays = haystack.toCharArray();
        char[] charNeed = needle.toCharArray();
        int str = str(charSays, charNeed[0],0);
        if (str+charNeed.length > charSays.length) return -1;
        for (int i=0;i<charNeed.length;i++){
            if(str==-1) return -1;
            if(charSays[str+i]!=charNeed[i]){
                if(charSays.length>str+charNeed.length){
                    str=str(charSays, charNeed[0], str+1);
                    i=-1;
                }else {
                    return -1;
                }
            }
        }

        return str;
    }
    public int str(char[] a,char b,int c){
        for (int i=c;i<a.length;i++){
            if (a[i]==b) return i;
        }

        return -1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


