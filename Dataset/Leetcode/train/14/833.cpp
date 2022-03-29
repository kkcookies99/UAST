 class Solution {
public:
    static bool mysort(string& s1, string& s2){
        return s1.size()<s2.size();
    }
    string XXX(vector<string>& strs) {
        //按字符串长度从小到大排序
        sort(strs.begin(), strs.end(), mysort);

        string res = "";
        for(int i=0; i<strs[0].size(); i++){                //遍历最短的长度就行了
            for(int j=0; j<strs.size()-1; j++){             //找相同的前缀
                if(strs[j][i]!=strs[j+1][i]) return res;
            }
            res+=strs[0][i];
        }
        return res;
    }
};

