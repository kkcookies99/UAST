 class Solution {
    public int XXX(String s) {
        int length=s.length();
        int res=0;
        for(int i=length-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
                continue;
            while(i>=0&&s.charAt(i)!=' ')
            {
                res++;
                i--;
            }
            break; 
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


