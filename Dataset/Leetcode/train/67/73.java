 class Solution {
    public String XXX(String a, String b) {
        int lena=a.length(),lenb=b.length();
        int len=(lena>lenb)?lena:lenb;
        int lenmin=(lena<lenb)?lena:lenb;
        String s=(lena>lenb)?a:b;
        int lens=s.length();
        int flag=0;
        char[] chs=new char[len+1];
        for(int i=0;i<len;i++)
        {
            if(lenmin>i)
            {
                if(a.charAt(lena-1-i)=='0'&&b.charAt(lenb-1-i)=='0')
                {
                    if(flag==0)
                        chs[len-i]='0';
                    else
                    {
                        chs[len-i]='1';
                        flag=0;
                    }
                }
                else if(a.charAt(lena-1-i)=='0'&&b.charAt(lenb-1-i)=='1'||
                       a.charAt(lena-1-i)=='1'&&b.charAt(lenb-1-i)=='0')
                {
                    if(flag==0)
                        chs[len-i]='1';
                    else
                    {
                        chs[len-i]='0';
                        flag=1;
                    }
                }
                else if(a.charAt(lena-1-i)=='1'&&b.charAt(lenb-1-i)=='1')
                {
                    if(flag==0)
                    {
                        chs[len-i]='0';
                        flag=1;
                    }
                    else
                    {
                        chs[len-i]='1';
                        flag=1;
                    }
                }
            }
            else
            {
                if(s.charAt(lens-1-i)=='0')
                {
                    if(flag==0)
                    {
                        chs[len-i]='0';
                    }
                    else
                    {
                        chs[len-i]='1';
                        flag=0;
                    }
                }
                else
                {
                    if(flag==0)
                        chs[len-i]='1';
                    else
                    {
                        chs[len-i]='0';
                        flag=1;
                    }
                }
            }
        }
        if(flag==0)
            return new String(chs,1,len);
        else
        {
            chs[0]='1';
            return new String(chs);
        }
    }
}

