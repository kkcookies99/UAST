 class Solution {
public:
	void XXX(vector<int>& nums) {
		int head = 0;
		int last = nums.size() - 1;
		int index = 0;
		while (index <= last) {
			if (nums[index] == 0) {
				int temp = nums[head];
				nums[head++] = 0;
				nums[index] = temp;
				index++;
			}
			else if (nums[index] == 1) {
				index++;
			}
			else if (nums[index] == 2) {
				int temp = nums[last];
				nums[last--] = 2;
				nums[index] = temp;
			}
		}
	}
};

