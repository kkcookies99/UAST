class Solution {
    public int XXX(int x) {
        if(x<2)
            return x;
        int left=1;
        int right=x/2;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(Math.pow(mid,2)<x)
                left=mid+1;
            else if(Math.pow(mid,2)>x)
                right=mid-1;
            else
                return mid;
        }
        return right;

    }
}

