 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.empty())
            return "";
        
        int l = 0;
        int r = strs.size() - 1;
        
        return LCP(strs, l, r);
    }
    
    string LCP(vector<string>& strs, int l, int r) {
        if(l == r)
            return strs[l];
        
        int mid = (l + r) / 2;
        string lcpLeft = LCP(strs, l, mid);
        string lcpRight = LCP(strs, mid + 1, r);
        
        return commonPrefix(lcpLeft, lcpRight);
    }
    
    string commonPrefix(string lcpLeft, string lcpRight) {
        int min = lcpLeft.size() > lcpRight.size() ? lcpLeft.size() : lcpRight.size();
        
        for(int i = 0; i < min; ++i){
            
            if(lcpLeft[i] != lcpRight[i])
                return lcpLeft.substr(0, i);
            }
        return lcpLeft.substr(0, min);
    }
};

