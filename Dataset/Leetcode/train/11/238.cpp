class Solution {
public:
    int XXX(vector<int>& height) {
        int ptr1 = 0, ptr2 = height.size()-1;
        int max_val = 0;
        while(ptr1!=ptr2){
            max_val = max(max_val,min(height[ptr1],height[ptr2])*(ptr2-ptr1));
            if(height[ptr1]<height[ptr2]){
                ptr1++;
            }
            else ptr2--;
        }
        return max_val;
    }
};

