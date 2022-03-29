 class Solution {
public:
    string getCommonStr(string &s1,string&s2){
        string res = "";
        int sizeS1 = s1.size();
        int sizeS2 = s2.size();
        int n = min(sizeS1,sizeS2);
        for(int i = 0;i<n;i++){
            if(s1[i] == s2[i]){
                res += s1[i];
            }
            else{
                return res;
            }
        }
        return res;

    }
    string XXX(vector<string>& strs,int lo,int hi){
        if(lo == hi) return strs[lo];
        int mid = lo+(hi-lo)/2;
        string s1 = XXX(strs,lo,mid);
        string s2 = XXX(strs,mid+1,hi);
        return getCommonStr(s1,s2);

    }
    string XXX(vector<string>& strs) {
        return XXX(strs,0,strs.size()-1);
    }
};

