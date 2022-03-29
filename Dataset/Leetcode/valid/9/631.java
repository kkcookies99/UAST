 class Solution {
    public boolean XXX(int x) {
        String s = String.valueOf(x);
        if(s.length()==1){
            return true;
        }
        for (int i = 0; i < s.length()/2+1; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


