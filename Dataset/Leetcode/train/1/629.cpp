 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> s=nums;
        int arr[2];
        sort(s.begin(),s.end());
        int l=0,r=s.size()-1;
        while(l<r){
            if(s[l]+s[r]==target){
                int ll=find(nums.begin(),nums.end(),s[l])-nums.begin();
                if(s[l]==s[r])    nums[ll]--;
                int rr=find(nums.begin(),nums.end(),s[r])-nums.begin();
                arr[0]=ll;
                arr[1]=rr;
                break;
            }else if(s[l]+s[r]>target)
                r--;
            else
                l++;
        }
        return vector<int>(arr,arr+2);
    }
};

