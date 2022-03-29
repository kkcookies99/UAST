class Solution {
public:
    int XXX(int m, int n) {
        long long result = 1;
        int tmp = m<n?m:n;
        for(int i=0;i<tmp-1;i++)
        {
            result=result*(m+n-i-2)/(i+1);
        }
        return result;
    }
};

