 class Solution {
    public boolean XXX(String s) {
      int n=s.length();
        int l=0,r=n-1;
        char[]cc=s.toLowerCase().toCharArray();
        while(l<r){
            //发现如果非数字字母就跳过比较指针往前走
            if(!check(cc[l])) while(l<r &&!check(cc[l])) l++;
            if(!check(cc[r])) while(l<r &&!check(cc[r])) r--;
            if(check(cc[l])&&check(cc[r])&&cc[l]!=cc[r]) return false;
            l++;r--;
        }
        return true;
    }

    private boolean check(char c){
        if(c-'0'>=0 &&c-'0'<=9)return true;
        if(c-'a'>=0 &&c-'a'<=25)return true;
        return false;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


