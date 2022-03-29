 class Solution {
    public int XXX(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
                if(i>=1&&s.charAt(i-1)==' '||i==0)  return count;
            }
        }
        return 0;
    }
}

