 class Solution {
    public boolean XXX(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char i;
            char j;
           while(start <end &&!((s.charAt(start)>='a' && s.charAt(start)<='z') || (s.charAt(start)>='A' && s.charAt(start)<='Z') || (s.charAt(start)>='0' && s.charAt(start)<='9')))
                start++;
            while(start<end &&!((s.charAt(end)>='a' && s.charAt(end)<='z') || (s.charAt(end)>='A' && s.charAt(end)<='Z')|| (s.charAt(end)>='0' && s.charAt(end)<='9')))

                end--;
            if(start>=end)
                return true;
            i=s.charAt(start);
            j=s.charAt(end);
            if(i>='a')
                i= (char) (i-32);
            if(j>='a')
                j=(char)(j-32);
            if(i!=j)
                return false;
            start++;
            end--;
        }
        return true;
    }
}

