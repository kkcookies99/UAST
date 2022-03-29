 class Solution {
    public String XXX(String a, String b) {
        List<Character>list=new ArrayList<>();
        int flag=0;
        if(a.length()!=b.length())
        {
            if(a.length()<b.length())
            {
                StringBuilder sb=new StringBuilder(a);
                for(int ii=0;ii<b.length()-a.length();ii++)
                    sb.insert(0,'0');
                a=sb.toString();
            }
             if(a.length()>b.length())
            {
                StringBuilder sb=new StringBuilder(b);
                for(int ii=0;ii<a.length()-b.length();ii++)
                    sb.insert(0,'0');
                b=sb.toString();
            }
        }
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0&&j>=0)
        {
            if(a.charAt(i)=='1'&&b.charAt(j)=='1')
            {
                if(flag==1)
                    list.add(0,'1');
                else
                    list.add(0,'0');
                flag=1;
            }
            else if(a.charAt(i)=='0'&&b.charAt(j)=='0')
            {
                if(flag==1)
                    list.add(0,'1');
                else
                    list.add(0,'0');
                flag=0;
            }
            else if((a.charAt(i)=='1'&&b.charAt(j)=='0')||(a.charAt(i)=='0'&&b.charAt(j)=='1'))
            {
                if(flag==1)
                {
                list.add(0,'0');
                flag=1;
                }
                else
                {
                    list.add(0,'1');
                    flag=0;
                }
            }
            i--;
            j--;
        }
        
        if(flag==1)
            list.add(0,'1');
        return list.stream().map(String::valueOf).collect(Collectors.joining());
        }  
        }    

