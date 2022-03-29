 class Solution {
public:
    int XXX(vector<int>& height) {
        int i = 0, j = (int)height.size() - 1;
        int max_amount = -1;;
        while(i < j){
            int tmp = min(height[i], height[j]);
            int amount = tmp * (j - i);
            max_amount = max(max_amount, amount);
            if(height[i] <= height[j]) i++;
            else j--;
        }
        return max_amount;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


