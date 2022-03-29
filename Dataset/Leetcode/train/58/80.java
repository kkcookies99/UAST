 class Solution {
    public int XXX(String s) {
        int ans = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                ans++;
            }
            if(i-1>=0&&ans!=0&&s.charAt(i-1)==' '){
                break;
            }
        }
        return ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


