 class Solution {
public:
	string XXX(string s, int numRows) {
		if(numRows==1) return s;
		vector<string> v(numRows);
		int flag=-1,i=0;
		for(auto c : s){
			v[i]+=c;
			if(i==0 || i==numRows-1) flag*=-1;
			i+=flag;
		}
		string ans="";
		for(auto it : v) ans+=it;
		return ans;
	}
};

