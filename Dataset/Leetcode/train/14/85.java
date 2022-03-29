 class Solution {
    public String XXX(String[] strs) {
int min=100,j;
        for(int i=0;i<strs.length;i++)
        {
            min=Math.min(min,strs[i].length());
        }
        char []num=new char[min];
        for(int i=0;i<min;i++)
        {
            for(j=0;j<strs.length-1;j++)
            {
                if((strs[j].charAt(i)^strs[j+1].charAt(i))==0)
                {continue;}
                else break;
            }
            if(j==strs.length-1)num[i]=strs[0].charAt(i);
            else break;
        }
        String result=new String(num);
        String result1=result.trim();
        return result1;
    }
}

