 class Solution {
    public String XXX(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String str = strs[0];
        for(int i =1;i<strs.length;i++){
            while(!strs[i].startsWith(str)){
                str = str.substring(0,str.length()-1);
            }
        }
        return str;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


