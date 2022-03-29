 class Solution {
    public String XXX(String[] strs) {

        if(strs.length==0)return "";
        if(strs.length==1)return strs[0];
         String s=strs[0];
        int max=0;

        for(int i=0;i<s.length();i++)
        {
            int def=0;
            char ch=s.charAt(i);
            for(int j=1;j< strs.length;j++)
            {
                if(i>=strs[j].length())break;
               char ch2=strs[j].charAt(i);
                if(ch==ch2)
                {
                  def++;
                }
            }

            if(def==strs.length-1)
            {
                max=i+1;
            }
            else
            {
                break;
            }
        }

        if(max==0)
        {
            return "";
        }
        else
        {
           return s.substring(0,max);
        }
    }
}