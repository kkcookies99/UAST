 class Solution {
public:
    void XXX(vector<int>& nums) {
        int n=nums.size();
        int i=0,j=0,k=n-1;        
        while(i<=k){
            switch(nums[i]){
                case 0:
                    swap(nums[i],nums[j]);
                    i++;
                    j++;
                    break;
                case 1:
                    i++;
                    break;
                case 2:
                    swap(nums[i],nums[k]);
                    k--;
                    break;
                default:
                    break;
            }
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


