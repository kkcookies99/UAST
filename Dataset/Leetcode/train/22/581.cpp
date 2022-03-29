 class Solution {
public:
void dfs(int index,int len,string part, vector<string> &solve,int l,int r)
{
	if (l == len || r == len)
	{
		return;
	}
	if (2*len == index+2)
	{
		part.append(1, ')');
		solve.push_back(part);
		return;
	}
	
	string New=part;
	New.append("(");
	dfs(index + 1, len, New, solve,l+1,r);
	if (l >= r)
	{
		part.append(")");
		dfs(index + 1, len, part, solve, l, r + 1);
	}
}
    vector<string> XXX(int n) {
        	vector<string> solve;
string part = "(";
		dfs(0, n, part, solve,0,0);
        return solve;
    }
};

