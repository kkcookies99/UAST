 class Solution {
public:
    vector<string> result;
    vector<string> XXX(int n) {
        string str="";
        linkStr(result, str, n, n);
        return result;
    }

    void linkStr(vector<string> &result, string str, int l, int r){
        if (r==l && l==0)
            return result.push_back(str);

        if (l==r)
            linkStr(result, str+'(', l-1, r);
        else if(l<r && l==0)
            linkStr(result, str+')', l, r-1);
        else if(l<r && l!=0){
            linkStr(result, str+')', l, r-1);
            linkStr(result, str+'(', l-1, r);
        }
        else
            return;
    }
};

