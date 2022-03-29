class Solution {
    public boolean XXX(int x) {
        String s=String.valueOf(x);
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--)) return false;
        }
        return true;
    }
}

class Solution {
    public boolean XXX(int x) {
        int y=0,temp=x;
        while(temp>0){
            y=y*10+temp%10;
            temp/=10;
        }
        return x==y;
    }
}

