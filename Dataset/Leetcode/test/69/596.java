class Solution {
    public int XXX(int x) {
        int low=0;
        int high=x;
        if(x==0){
            return 0;
        }
        if(x<=3&&x>0){
            return 1;
        }
        while(low<high){
            int mid =low+(high-low)/2;      //取两者的中值
            if(mid*mid==x ){
                return mid;
            }
            if((double)x/mid <=mid){    //防止溢出（mid*mid最后容易溢出）
               high=mid-1; 
            }else{
                low=mid+1;
            }
        }
        return low*low>x?low-1:low;
    }
}

