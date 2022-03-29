 class Solution {
public:
    int XXX(vector<int>& height) {
        int len=height.size(),res=0,i=0,j=len-1,min,cur;
        while(i<j){
            min=height[i]<height[j]?height[i]:height[j];
            cur=min*(j-i);
            if(cur>res)res=cur;
            height[i]<height[j]?i++:j--;
        }
        return res;
    }
};


