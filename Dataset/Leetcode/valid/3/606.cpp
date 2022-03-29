 class Solution {
public:
    int XXX(string s) {
        int len = s.size(), max=0, j=0;
        map<char,int> A;
        for(int i=0; i<len; ++i){
            if(A[s[i]] != 0)
                j = A[s[i]]>j? A[s[i]]: j;
            max = max>(i-j+1)? max: (i-j+1);
            A[s[i]] = i+1;
        }
        return max;
    }
};

