 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {		
		int total = m+n;
		if(m>=0 && n==0) return;
		else if(m==0 && n>0) {
			for(int i = 0; i < n; i++) nums1.insert(nums1.begin()+i, nums2[i]);
			while(nums1.back()==0&&nums1.size()>total) nums1.pop_back();
			return;
		}
		int i1 = 0;
		int i2 = 0;
		for(; i2 < n; i2++) {
			for(; i1 < m; i1++) {
				if(nums2[i2]<=nums1[i1]) {
					nums1.insert(nums1.begin()+i1, nums2[i2]);
					m++;
					break;
				} else if(i1 >= m-1) {
					nums1.insert(nums1.begin()+m, nums2[i2]);
					m++;
					break;
				}
			}
		}
		while(nums1.back()==0&&nums1.size()>total) nums1.pop_back();
    }
};

