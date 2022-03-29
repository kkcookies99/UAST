 class Solution {
public:
    int XXX(vector<int>& height) {
        //双指针算法
        //i=0,j=n;每次移动最短边，遍历取得最大值
        int res=0,v;
        int n=height.size();
        int i=0,j=n-1;
        while(i<j){
              v=(height[i]<height[j]?height[i]:height[j])*(j-i);
            if(height[i]<height[j])i++;
            else j--;
            res=res>v?res:v;
        }
        return res;
    }
};

