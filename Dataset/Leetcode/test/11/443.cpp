 class Solution {
public:
    int XXX(vector<int>& height) {
        int a = 0, maxa = 0, i = 0, j = height.size()-1;
        while (i < j) maxa=(a=height[i]>height[j]?height[j--]*(j-i+1):height[i++]*(j-i+1))>maxa?a:maxa;
        return maxa;
    }
};

