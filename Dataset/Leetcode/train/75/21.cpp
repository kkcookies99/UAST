class Solution {
public:
    void exc(int &a,int& b){
        int t=a;
        a=b,b=t;
    }
    void XXX(vector<int>& nums) {
        int n=nums.size(),pre=0,back=n-1,i=0;
        while(i<=back)
            if(nums[i]==0){
                exc(nums[i],nums[pre++]);
                if(nums[i]==0)
                    i++;
            }
            else if(nums[i]==1)
                i++; 
            else
                exc(nums[i],nums[back--]);           
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


