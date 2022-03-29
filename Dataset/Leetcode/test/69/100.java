public int XXX(int x) {
        //应该是双指针二分查找
        int left=1;
        int right=x/2 + 1;
        while(left<right){
            int mid=(left+right)/2;
            if(mid*mid==x){
                return mid;
                
            }
            else if(mid*mid>x){
                right=mid;
            }
            else if(mid*mid<=x){
                left=mid;
            }
        }
        return left;
    }

