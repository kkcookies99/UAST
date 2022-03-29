 class Solution {
public:
    int XXX(string s) {
        int n=s.length();
        if(!n)
            return 0;
        int l=0, r=0, dict[255]={0}, res=0;
        while(r<n)
        {
            dict[s[r]]++;
            while(dict[s[r]]>1)
            {
                dict[s[l]]--;
                l++;
            }
            res=max(res, r-l+1);
            r++;
        }
        return res;
    }
};

