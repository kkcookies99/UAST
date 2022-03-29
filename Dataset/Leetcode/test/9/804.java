 class Solution {
    public boolean XXX(int x) {

        //转数组，双指针
        // String sx = String.valueOf(x);
        // for(int i=0,j=sx.length()-1;i<=j;i++,j--){
        //     if(sx.charAt(i)!=sx.charAt(j)){
        //         return false;
        //     }
        // }
        // return true;

        //
    if(x<0){
            return false;
        }
        int copyX=x;
        int reverse=0;
        while(copyX!=0){
            reverse=reverse*10+copyX%10;
            copyX=copyX/10;
        }
        return x==reverse;
    }
}

