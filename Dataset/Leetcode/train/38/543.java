 class Solution {
    public String XXX(int n) {
        if(n==1)return "1";
   
        String str=XXX(n-1);
        int i=0;
        char old=str.charAt(0);
        StringBuffer res = new StringBuffer();
        int count=0;
        while(i<str.length())
        {
            if(str.charAt(i)==old)
            {
                count++;
            }
            else
            {
                res.append(count);
                res.append(old);
                old=str.charAt(i);
                i--;
                count=0;
            }
            i++;
        }
        res.append(count);
        res.append(old);
        return res.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


