class Solution {
    public int XXX(int x) {
        if(x==0){return 0;}
        int left=0;
        int right=x;
        while(left!=right-1){
            long mid=(long)(left+right)/2;
            if(mid*mid==x){
                return (int)mid;
            }else if(mid*mid<x){
                left=(int)mid;
            }else{
                right=(int)mid;
            }
        }

        if(left*left==x){
            return left;
        }else if(right*right==x){
            return right;
        }else if(left*left<x){
            return left;
        }else{
            return right;
        }
    }
}```

