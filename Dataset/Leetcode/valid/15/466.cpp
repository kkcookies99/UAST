 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(),nums.end() );
        int n = nums.size();
        //b+c = -a
        //a + b + c = 0;
        // unordered_set<int> in;
        vector< vector<int >> res;
        for(int i=0;i<n ;++i) {
            int a = nums[i];
            int p = i+1, q = n-1;
            if(p>= n || q<= p) break;
            if(i && nums[i] == nums[i-1]) continue;
            
            while(p< q) {
                
                int b = nums[p] , c = nums[q];
                int t  = a+b + c;
                if(t <0) {
                    p++;
                }else if(t > 0) {
                    q--;
                }else {
                    res.push_back({ a, b, c });
                    while(p<q  && nums[q] == nums[q-1]) --q;
                    while(p<q && nums[p] == nums[p+1]) ++p;
                    q--;
                    p++;
                     
                 
                }
            }
        }
        return res;
    }
};

