class Solution {
public:
    int XXX(int x) {
        if (x <= 1) return x;
        int smallCandidate = XXX(x >> 2) << 1;
        int largeCandidate = smallCandidate + 1;
        if (largeCandidate > (x / largeCandidate)) return smallCandidate;
        else return largeCandidate;
    }
};

