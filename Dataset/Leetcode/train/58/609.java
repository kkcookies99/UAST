class Solution {
    public int XXX(String s) {
        String str=s.strip();
        int res=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                res+=1;
            }else{
                break;
            }
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


