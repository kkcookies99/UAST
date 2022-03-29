 class Solution {
    public String XXX(int n) {
        int i=1;
            StringBuffer list=new StringBuffer();
            list.append("1");
            if(n==1)
            {
                return list.toString();
            }
            for(i=1;i<n;i++)
            {
                char prechar=list.charAt(0);
                StringBuffer sb=new StringBuffer();
                int count=1;
                for(int j=1;j<list.length();j++)
                {
                    char curchar=list.charAt(j);//你的爱我不会忘怀
                    if(curchar==prechar)
                    {
                        count++;
                    }
                    else
                    {
                        sb.append(count).append(prechar);
                        prechar=curchar;
                        count=1;
                    }
                }
                sb.append(count).append(prechar);
                count=1;
                list=sb;
            }
            return list.toString();
    }
}

