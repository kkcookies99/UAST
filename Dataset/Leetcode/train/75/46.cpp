class Solution {
public:
    void XXX(vector<int>& nums) {

        int r=-1,w=-1,b=-1;
        for(int i=0;i<nums.size();i++)
        {
            if (nums[i]==2)
            {
                b+=1;
            }
            else if(nums[i]==1)
            {   nums[i]=2;
                nums[w+1]=1;
                b+=1;
                w+=1;
            }
            else
            {   nums[b+1]=2;
                nums[w+1]=1;
                nums[r+1]=0;
                r++;w++;b++;

            }
        }

    }
};

