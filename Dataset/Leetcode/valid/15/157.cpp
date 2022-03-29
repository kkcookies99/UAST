 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums, int sum = 0) {
		vector<vector<int>> result;   // 保存结果集
		vector<int> combination;;  // 保存一次结果集
		// 先对数组排序
		sort(nums.begin(), nums.end());

		// 将三个数的和的问题转化为两个个数的和： a+b+c=sum => a+b=sum-c，下面的循环中：left+right=sum-base
		for (auto base = 0; base < nums.size(); ++base)
		{
			// 对于相同的基准数则过滤掉，结果集去重
			if (base > 0 && nums.at(base) == nums.at(base - 1))
			{
				continue;
			}

			// 如果基准值比 sum/3 还大，则结束，因为base后面的数都不小于base，三个数的和一定大于sum
			if (nums.at(base) > sum / 3)
			{
				break;
			}

			// 头尾两个指针进行扫描，因为数组已排序，可以从base后面扫描，避免重复的组合
			auto left = base + 1;
			auto right = nums.size() - 1;
			while (left < right)
			{
				if (nums.at(left) + nums.at(right) > sum - nums.at(base))
				{ // 如果left+right>sum-base，则应减小，right左移
					--right;
				} else if (nums.at(left) + nums.at(right) < sum - nums.at(base))
				{ // 如果left+right<sum-base，则应减小，left右移
					++left;
				} else
				{ // 相等的情况下得到一组解
					combination.clear();
					combination.push_back(nums.at(base));
					combination.push_back(nums.at(left));
					combination.push_back(nums.at(right));
					result.push_back(combination);
					
					while (left < right && nums.at(left) == nums.at(left + 1))
					{ // 如果 left 和 left+1 相同，则略过，避免出现重复组合
						++left;
					}

					while (left < right && nums.at(right) == nums.at(right - 1))
					{ // 如果 right 和 right-1 相同，则略过，避免出现重复组合
						--right;
					}

					// 处理下一对数
					++left;
					--right;
				}
			}
		}

		return result;
	}
};

