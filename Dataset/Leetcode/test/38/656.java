 class Solution {
    public String XXX(int n) {

        if(n==1)
        {
            return "1";
        }

        StringBuilder s = new StringBuilder(5000);
        StringBuilder s1 = new StringBuilder(5000);
        s.append("1");
        for(int i=2;i<=n;i++)
        {
            int k=0;
            char temp = s.charAt(0);
            s1.delete(0,s1.length());
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==temp)
                {
                    k = k+1;
                    if(j!=s.length()-1)
                    {
                        if(s.charAt(j)!=s.charAt(j+1))
                        {
                            s1.append(k);
                            s1.append(temp);
                            temp = s.charAt(j+1);
                            k=0;
                        }
                    }
                    else
                    {
                        s1.append(k);
                        s1.append(s.charAt(j));
                    }
                }        
            }
            s.delete(0,s.length());
            s.append(s1.substring(0));
        }
        return s.toString();
    }
}

