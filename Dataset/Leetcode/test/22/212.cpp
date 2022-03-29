 class Solution {
public:
    vector<string> XXX(int n) {
        if(n<1)return {""};
        vector<int> count (2,n);//rest bracket
        string comb = "(" ;
        count[0]--;
        int wait_right = 1;
        vector<string>ans;
        dfs(ans,comb,count,wait_right);
        return ans;
    }
    void dfs(vector<string> &ans, string &comb, vector<int> &count, int &wait_right){
        if(count[0]==0&&count[1]==0)ans.push_back(comb);
        //when add left bracket : if more left
        if(count[0]>0){
            comb+='(';
            count[0]--;
            wait_right++;
            dfs(ans,comb,count,wait_right);
            count[0]++;//trace back
            comb.pop_back();
            wait_right--;
        }
        //when add right bracket : if have left waiting for pair, more right left
        if(wait_right>0 && count[1]>0){
            comb+=')';
            count[1]--;
            wait_right--;
            dfs(ans,comb,count,wait_right);
            count[1]++;//trace back
            comb.pop_back();
            wait_right++;
        }
    }
};

