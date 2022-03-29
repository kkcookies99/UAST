 class Solution {
    public int XXX(String s) {
        int count=0;
        String ss=s.trim();
        System.out.println(ss.length());
        for(int i=ss.length()-1;i>=0;i--)
        {
             if(ss.charAt(i)!=' ')
                 count++;
             else if(ss.charAt(i)==' '||i==0)
                 break;
        }
    return count;
    }
}

