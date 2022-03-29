class Solution {
public:
    void XXX(vector<int>& nums) {
        int len=nums.size();
        int zero=0,one=0,two=0;
        for(int i=0;i<len;i++)
        switch(nums[i]){
            case 0:
                zero++;
                break;
            case 1:
                one++;
                break;
            case 2:
                two++;
                break;
        }
        int i,j,k;
        for(i=0;i<zero;i++) nums[i]=0;
 
        for(j=i;j<one+zero;j++) nums[j]=1;
        for(k=j;k<len;k++) nums[k]=2;
    }
};```

