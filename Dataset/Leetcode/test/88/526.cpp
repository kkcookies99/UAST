 class Solution {
public:
    void XXX(vector<int>& n1, int m, vector<int>& n2, int n) {
        int p1=m-1,p2=n-1,p=m+n-1;
        while(p1>=0&&p2>=0)
        {
            while(n1[p1]>=n2[p2]&&p1>=0&&p2>=0)
                n1[p--] = n1[p1--];
            while(n1[p1]<n2[p2]&&p1>=0&&p2>=0)
                n1[p--]=n2[p2--];
        }
        while(p2>=0)
            n1[p--]=n2[p2--];
    }
};

