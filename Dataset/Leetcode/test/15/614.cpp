 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
      if (nums.size() == 0) return vector<vector<int>>();
      std::multimap<int, int> nums_map;
      std::unordered_map<long, bool> nums_found_map;
      vector<vector<int>> ret;
      std::sort(nums.begin(), nums.end());
      int min_num = nums[0];
      int max_num = nums[nums.size() - 1];
      for (int i = 0; i < nums.size(); i++) {
        nums_map.insert({nums[i], i});
      }
      for (int i = 0; i < nums.size(); i++) {
        for (int j = i + 1; j < nums.size(); j++) {
          int num_a = nums[i];
          int num_b = nums[j];
          if (num_a + num_b > -min_num) break;
          if (num_a + num_b < -max_num) continue;
          int need_num = -(num_a + num_b);
          auto multimap_pair = nums_map.equal_range(need_num);
          if (multimap_pair.first == multimap_pair.second) {
              continue;
          }
          bool find_target_num = false;
          for (auto it = multimap_pair.first; it != multimap_pair.second; it++) {
            int matched_index = it->second;
            if (matched_index != i && matched_index != j) {
              find_target_num = true;
              break;
            }
          }
          if (!find_target_num) {
            continue;
          }
          int nums_min = std::min(num_a, std::min(num_b, need_num));
          int nums_max = std::max(num_a, std::max(num_b, need_num));
          int nums_middle = 0 - nums_min - nums_max;
          long key = (long(abs(nums_min)) << 34) + (long(abs(nums_middle)) << 17) + nums_max;
          if (nums_min < 0) key += 0x8000000000000;
          if (nums_middle < 0) key += 0x200000000;
          if (nums_found_map.find(key) == nums_found_map.end()) {
            nums_found_map.insert({key, true});
            ret.push_back({nums_min, nums_middle, nums_max});
          }
        }
      }
      return ret;
    }
};

