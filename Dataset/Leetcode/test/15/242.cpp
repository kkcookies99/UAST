 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> shit;
        sort(nums.begin(),nums.end());
        int n=nums.size();
        for(int i=0;i<n-2;i++){
            if(nums[i]<=0){
                if(i>=1&&nums[i]==nums[i-1])
                    continue;
                else{
                    int a=1;
                    int le=i+1;
                    int ri=n-1;
                    while(le<ri){
                        if(nums[le]+nums[ri]>-nums[i])
                            ri-=1;
                        else if(nums[le]+nums[ri]<-nums[i])
                            le+=1;
                        else{
                            if(a>1&&nums[le]==nums[le-1]){
                                a++;
                                le++;
                                ri--;
                                continue;
                            }
                            vector<int> fuck(3);
                            fuck[0]=nums[i];
                            fuck[1]=nums[le];
                            fuck[2]=nums[ri];
                            shit.push_back(fuck);
                            a++;
                            le++;
                            ri--;
                        }
                    }
                }
            }
        }
        return shit;
    }
};

