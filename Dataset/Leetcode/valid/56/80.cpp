class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
		vector<vector<int>> res;
    stack<pair<int,int>> s;
    sort(intervals.begin(),intervals.end());
    s.push(pair<int,int>(intervals[0][0],intervals[0][1]));
    int len = intervals.size();
    for(int i=1;i<len;i++){
    	auto temp = pair<int,int>(intervals[i][0],intervals[i][1]);
    	while(!s.empty()&&temp.first>=s.top().first&&temp.first<=s.top().second){
    		temp.second = max(temp.second,s.top().second);
    		temp.first = min(temp.first,s.top().first);
    		s.pop();
		}
		s.push(temp);
	}
	vector<int> a;
	while(!s.empty()){
		a.push_back(s.top().first);
		//cout<<s.top().first<<endl;
		a.push_back(s.top().second);
		res.push_back(a);
		a.clear();
		s.pop();
	}
    return res;
    }
};

