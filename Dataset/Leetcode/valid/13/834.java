 class Solution {
    public int XXX(String s) {
        String[] s2=s.split("");
        int count=0;
        int flag=0;
        for(int i=0;i<s2.length;i++)
        {
            if(s2.length<2)
            {
                count+=stringtoint(s2[i]);
            }
            else{
                if(i+1<s2.length){
                    if(stringtoint(s2[i+1])>stringtoint(s2[i]))
                    {
                         count+=(stringtoint(s2[i+1])-stringtoint(s2[i]));
                         i++;
                         if(i+1>=s2.length)
                         {
                             flag=1;
                         }
                         
                    }
                    else{
                    count+=stringtoint(s2[i]);
                    }
                    
                }
                else if(flag==0)
                {
                    count+=stringtoint(s2[i]);
                }
            }
        }
        return count;
        //"MCMXCIV""MCMXCVI"
    }
    public int stringtoint(String s1)
    {
        int temp=0;
        if(s1.equals("I"))
        {
            temp=1;
        }
        else if(s1.equals("V"))
        {
            temp=5;
        }
        else if(s1.equals("X"))
        {
            temp=10;
        }
        else if(s1.equals("L"))
        {
            temp=50;
        }
        else if(s1.equals("C"))
    {
        temp=100;
    }
        else if(s1.equals("D"))
        {
            temp=500;
        }
        else if(s1.equals("M"))
        {
            temp=1000;
        }
        return temp;
    }
}

