 class Solution {
public:
	double XXX(vector<int>& nums1, vector<int>& nums2) {
		
		auto left = nums1.begin();
		auto right = nums2.begin();
		int size = nums1.size() + nums2.size();
		int sum = 0;
		int temp = 0; 
		int temp1 = 0;
		for (int i = 0; i <= size / 2; i++)
		{	
			if (left == nums1.end())
				temp = *right++;
			else if (right == nums2.end())
				temp = *left++;
			else if (*left < *right)
				temp = *left++;
			else
				temp = *right++;
			if (size / 2 - 1 == i)
			{
				temp1 = temp;
			}
		}
		if (size % 2 != 0)
		{
			return temp;
		}
		else
		{
			return (temp + temp1) / 2.0;
		}

	}
};

