class Solution {
public:
    int XXX(int n) {
        vector<int> mem(n+1,-1);
        mem[0] = 1;
        mem[1] = 1;
        for(int i = 2;i<n+1;i++)
            mem[i] = mem[i-1] + mem[i-2];
        return mem[n];
    }
};

