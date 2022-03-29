 class Solution {
    public boolean XXX(String s) {
        char []c=new char[s.length()];
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            char t =s.charAt(i);
            if(t=='('||t=='{'||t=='[')
            {
                c[index]=t;
                index++;
            }else{
                if(index==0)
                    return false;
                index--;
                if(t==')')
                {
                    if(c[index]!='(')
                    {
                        return false;
                    }
                }else if(t=='}')
                {
                    if(c[index]!='{')
                    {
                        return false;
                    }
                }else{
                    if(c[index]!='[')
                    {
                        return false;
                    }
                }
            }
        }
        if(index!=0)
            return false;
        else
            return true;
    }
}

