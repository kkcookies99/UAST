 class Solution {
    public String XXX(String[] strs) {

        String start = strs[0];
        boolean flag = true;
        String publicStr = "";
        if(strs.length==1){
            return strs[0];
        }
        for (int i=0; i<=start.length();i++)
        {
            String pre = start.substring(0,i);
            for (int j=1;j<strs.length;j++)
            {
                if (!strs[j].startsWith(pre))
                {
                    flag = false ;
                    break;
                }

            }

            if (!flag){break;}else {publicStr = pre;}
        }

        return publicStr;
        
        
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

