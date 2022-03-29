class Solution {
public:
    void XXX(vector<int>& nums) {
        int totalSize = nums.size();

        // size equals zero then return
        if(totalSize==0){
            return;
        }

        int head=0;

        // find first nonzero
        while(head<totalSize && nums[head]==0){
            head++;
        }

        // all zeros then return
        if(head>=totalSize){
            return;
        }

        // sort array from 0 to 2
        for(int i=0;i<3;i++){
            for(int j=head;j<totalSize;j++){
                // if num[j] equals to i then swap it with head
                if(nums[j]==i){
                    nums[j] = nums[head];
                    nums[head] = i;
                    head++;
                }
            }
        }

    }
};

