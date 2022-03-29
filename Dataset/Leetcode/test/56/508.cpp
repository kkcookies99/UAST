 class Solution {
public:
	vector<vector<int>> XXX(vector<vector<int>>& v) {
		sort(v.begin(), v.end()，cmp);
		int n = v.size();
		vector<vector<int>>ans;
		vector<int>gv = v[0];
		for (int i = 0; i < n; i++) {
			if (i==n-1||gv[1] < v[i + 1][0]) {
				ans.push_back(gv);
                                if(i!=n-1){
				gv = v[i + 1];
                               }
			}
			else {
				gv[1] = max(v[i + 1][1],gv[1]);
			}
		}
		return ans;
	}
	bool static cmp(vector<int>v, vector<int>vv) {
		return v[0] == vv[0] ? v[1] <= vv[1] : v[0] <= vv[0];
	}
};

