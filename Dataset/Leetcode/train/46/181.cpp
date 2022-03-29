class Solution {
public:
        vector<vector<int>> res ; 
public:
void permutations(vector<int>& nums,int m ,int k){
            if(m==k){
                    res.push_back(nums); 
              }else{
            for(int i=m ; i<nums.size();i++){
                    swap(nums[m],nums[i]);
                    permutations(nums,m+1 ,k); 
                    swap(nums[m],nums[i]);
            } 
        }   
          return  ; 
    }

public:
    void swap(int &x,int &y){
         int temp =x ;
         x=y ;
         y=temp; 
    }

public:
    vector<vector<int>> XXX(vector<int>& nums) {
            if(nums.size()==1) 
            return{{nums}} ;
       permutations(nums,0,nums.size()-1); 
            return res; 
    }
};

