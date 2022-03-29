 class Solution {
    public int XXX(String haystack, String needle) {

        int hLength = haystack.length();
        int nLength = needle.length();
        int i=0;
        int j=0;
        int k=0;

        while(i<nLength && j<hLength)
        {
            if(needle.charAt(i)==haystack.charAt(j))
            {
                //若needle.charAt(i)和haystack.charAt(j)相等,则继续往后面比较
                //即比较needle.charAt(i+1)和haystack.charAt(j+1)
                i++;
                j++;
            }
            else
            {
                //否则，进行回溯
                i=0;
                j=k+1; 
                k++;
            }
        }

        if(i==nLength)
        {
            return j-nLength;
        }
        else
        {
            return -1;
        }    
    }
    
}

