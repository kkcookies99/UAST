 class Solution {
    public boolean XXX(String s) {
        if(s==null) return true;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();++i){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String s1=sb.toString().toLowerCase();
        int left=0,right=s1.length()-1;
        while(left<right){
            if(s1.charAt(left)!=s1.charAt(right)) return false;
            ++left;
            --right;
        }
        return true;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


