 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        // 字典保存两数的值和其对应的和
        sort(nums.begin(), nums.end());
        vector<vector<int>> result;
        map<uint64_t, int> records;
        int length = nums.size();

        for (int i = 0; i < length-2; i ++){
            if (nums[i] > 0) {break;}
            //cout << nums[i] << " ";
            for (int j = i+1; j < length-1; j ++){
                if (-(nums[i]+nums[j]) < nums[j]) {break;}
                uint64_t key = nums[i];
                key = key << 32L;
                key = key | (((int64_t)nums[j]) & 0xffffffff);
                //cout << "it: " << nums[i] << "," << nums[j] << "->" << key << endl;
                if (records.find(key) == records.end()){
                    records[key] = j;
                }
            }
        }
        //cout << endl;

        for (auto &item : records){
            int n2 = (int)item.first;
            int n1 = (int)(item.first>>32L);
            int pos = BinarySearch(nums, -(n1 + n2));
            //cout << n1 << "," << n2 << "->" << pos << endl;
            if (pos != -1 && pos > item.second){
                result.push_back(vector<int>({n1, n2, nums[pos]}));
            }
        }

        //cout << "done\n";
        return result;
    }
};

