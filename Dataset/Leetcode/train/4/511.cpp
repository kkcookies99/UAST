 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int len1 = nums1.size(), len2 = nums2.size();
		if (len1 + len2 > 2 && len1 > 0 && len2 > 0) {
			if (nums1[len1 - 1] > nums2[len2 - 1]) {
				nums1.pop_back();
			}
			else {
				nums2.pop_back();
			}
			len1 = nums1.size();
			len2 = nums2.size();
			if (len1 != 0 && len2 != 0) {
				if (nums1[0] < nums2[0]) {
					nums1.erase(nums1.begin());
				}
				else {
					nums2.erase(nums2.begin());
				}
			}
			else {
				if (len1 == 0) {
					nums2.erase(nums2.begin());
				}
				else {
					nums1.erase(nums1.begin());
				}
			}
			return XXX(nums1, nums2);
		}
		else {
			if (len1 == 0) {
				return (nums2[(len2-1)/2] + nums2[len2/2]) / 2.0;
			}
			else if (len2 == 0) {
				return (nums1[(len1-1)/2] + nums1[len1/2]) / 2.0;
			}
			else {
				return (nums1[0] + nums2[0]) / 2.0;
			}
		}
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


