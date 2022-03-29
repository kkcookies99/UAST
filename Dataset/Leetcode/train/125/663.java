 class Solution {
    public boolean XXX(String s) {
        if(s.isEmpty())return true;
        int head=0,tail=s.length()-1;
        char h,t;
        while(head<=tail){
            h=s.charAt(head);
            t=s.charAt(tail);
            if(!Character.isLetterOrDigit(h))head++;
            else if(!Character.isLetterOrDigit(t))tail--;
            else{
                if(Character.toLowerCase(h)!=Character.toLowerCase(t))return false;
                head++;
                tail--;
            }
        }
        return true;
    }
}

