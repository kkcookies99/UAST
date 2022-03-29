class Solution {
    public int XXX(String s) {
        int count=0;
        int b=s.length()-1;
        while(s.charAt(b)==' '){
            b=b-1;
        }
        for(int i=b;i>=0;i--){
            char m=s.charAt(i);
            if(m!=' '){
                count++;
            }
            if(m==' '){
                break;
            }
        }
        return count;
    }
}

