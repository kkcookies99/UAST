class Solution {
public:
    int XXX(vector<int>& height) {
        int n=height.size();
        int res=0;
        int i,j;
//以第i 个版子开头，寻找右边最后一个比它大的板子
        for(i=0;i<n;i++){
            for(j=n-1;j>i;j--){
                if(height[j]>=height[i])
                    break;
            }
            res=max(res,height[i]*(j-i));
        }
//以第i 个版子，寻结尾，找左边第一个比它大的板子
        for( i=n-1;i>=0;i--){
            for(j=0;j<i;j++){
                if(height[j]>=height[i])
                    break;
            }
            res=max(res,height[i]*(i-j));
        }
        return res;
    }
};

