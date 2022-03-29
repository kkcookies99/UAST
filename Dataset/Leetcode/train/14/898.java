 class Solution {
    public String XXX(String[] strs) {
        int min = 0;
        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].length() < strs[min].length()){
                min = i;
            }
        }
        String s = strs[min];
        int minlen = strs[min].length();
        while(true){
            int i = 0;
            for(; i < strs.length ; i++){
                if(!strs[i].startsWith(s)){
                    s = s.substring(0,--minlen);
                    break;
                }
            }
            if(i == strs.length){
                return s;
            }else if(minlen < 0){
                return "";
            }
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


