 class Solution {
    public String XXX(int n) {
        String[] helper=new String[31];
        helper[1]="1";
        helper[2]="11";
        for (int i=3;i<=n;i++)
        {
            String pre=helper[i-1];
            StringBuilder tempStr=new StringBuilder("");
            int num=1;
            char tempChar=pre.charAt(0);
            for (int j=1;j<pre.length();++j)
            {
                if (pre.charAt(j)==pre.charAt(j-1))
                    num++;
                else {
                    tempStr.append(num+""+tempChar);
                    tempChar=pre.charAt(j);
                    num=1;
                }
            }
            tempStr.append(num+""+tempChar);
            helper[i]=tempStr.toString();
        }
        return helper[n];
    }
}

