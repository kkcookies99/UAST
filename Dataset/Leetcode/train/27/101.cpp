 class Solution {
public:
    int XXX(vector<int>& nums, int val) 
    {
        for(auto p=nums.begin();p!=nums.end();++p)
        {
            if(*p==val)
            {
                p=nums.erase(p);
            }
        }
        return nums.size();
    }
};


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

