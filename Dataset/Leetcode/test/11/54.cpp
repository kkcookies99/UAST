class Solution {
public:
    int XXX(vector<int>& height) {
        if(height.size() <= 1){
            return 0;
        }

        int head=0, tail=height.size()-1;
        int result = min(height[head], height[tail]) * (tail-head);

        while(head<tail){
            while(head<tail && height[head]<=height[tail]){
                result = max(min(height[head], height[tail]) * (tail - head), result);
                head++;
            }
            while(head<tail && height[head]>=height[tail]){
                result = max(min(height[head], height[tail]) * (tail - head), result);
                tail--;
            }
        }

        return result;
    }
};

