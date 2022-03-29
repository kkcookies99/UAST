 class Solution {
public:
	void XXX(vector<int>& nums) {
		int len = nums.size(),lef=0, mid=0, rig=len-1;       //三路快排
		while (mid <= rig) {         //终止条件
			//cout << nums[mid] << endl;
			if (nums[mid] < 1) {
				swap(nums[mid], nums[lef]);
				++mid;
				++lef;
			}
			else if (nums[mid] == 1) {
				++mid;
			}
			else {                  //nums[mid] > 1
				swap(nums[mid], nums[rig]);
				--rig;
			}
		}
	}
};

