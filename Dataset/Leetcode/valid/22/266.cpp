 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> ans;
    	if(n==0) return ans;
    	else ans.push_back("");
        vector<string> temp;
        int num = 0;
        
        while(num < n){
        	for(int i=0; i<ans.size(); ++i){
        		ans[i] += "()";
        		temp.push_back(ans[i]);
        		int j = 2*num;
        		while(j>0 && ans[i][j-1]!='('){
        			ans[i][j] = ')';
        			ans[i][j-1] = '(';
        			temp.push_back(ans[i]);
        			--j;
				}
			}

			ans.clear();
			for(int i=0; i<temp.size(); ++i){
				ans.push_back(temp[i]);
			}
			temp.clear();
        	++num;
        }
        return ans;
    }
};

