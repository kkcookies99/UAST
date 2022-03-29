 class Solution {
public:
double XXX(vector<int>& nums1, vector<int>& nums2) {
	vector <int > v = nums1 ;
	for (int i = 0; i < nums2.size(); i++)
		v.push_back(nums2[i]);
	sort(v.begin(),v.end());
	if (v.size() % 2)
		return v[v.size() / 2];
	else
		return (v[v.size() / 2] + v[v.size() / 2 - 1]) / 2.0;
}
};

