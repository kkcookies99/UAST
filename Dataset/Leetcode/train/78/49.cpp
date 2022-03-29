class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int size = nums.size();
        int totalCount = (1<<size);
        vector<vector<int>> results;

        for(int i=0;i<totalCount;i++){
            vector<int> result;
            int map = i;
            int bitCount = 0;
            while(map != 0){
                if(map&0x1==1){
                    result.push_back(nums[bitCount]);
                }
                bitCount++;
                map>>=1;
            }
            results.push_back(result);
        }

        return results;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


