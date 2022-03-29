 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>outputvec={};
        int size=nums.size();
        if(size<3)return outputvec;
        sort(nums.begin(),nums.end());
        set<vector<int>> myset;
        vector<int> myvec={};
        int front,back;
        front=0;
        for(int i=0;i<size;i++)
        {
            back=size-1;
            front=i+1;
            int temp=-nums[i];
            while(front<back)
            {
                if(nums[front]+nums[back]>temp)
                {
                    --back;
                }
                else if(nums[front]+nums[back]<temp) 
                {
                    ++front;
                }
                else
                {
                    myvec.push_back(nums[front]);
                    myvec.push_back(nums[back]);
                    myvec.push_back(nums[i]);
                    sort(myvec.begin(),myvec.end());
                    myset.insert(myvec);
                    myvec.clear();
                    ++front;
                }
            }
        } 
        for(auto it:myset)
        {
            outputvec.push_back(it);
        }
        return outputvec;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


