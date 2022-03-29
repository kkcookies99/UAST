 class Solution {
    public int XXX(String s) {
        int ans=0;
        int i=s.length()-1;
        while(i>=0&&s.charAt(i) == ' '){
            i--;
        }

        while(i>=0 && s.charAt(i) != ' '){
            i--;
            ans++;
        }

        return ans;
    }
    
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


