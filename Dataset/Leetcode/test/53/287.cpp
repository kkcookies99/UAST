class Solution {
public:
    int XXX(vector<int>& nums) {
             int i,max=nums[0],temp=0;
             int n=nums.size();
             if(n==1) return nums[0];
             for(i=0;i<n;i++){
                 temp+=nums[i];
                 if(temp>max)
                    max=temp;
                 if(temp<0)  temp=0;                        
             } 
                return max;            
    }
    
};

