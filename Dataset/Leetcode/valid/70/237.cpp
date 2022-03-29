class Solution {
public:
    int XXX(int n) {
        
        if (n == 2) return 2;
        if (n == 1) return 1;
        if (cache.count(n) != 0) return cache[n];

        int n2res = XXX(n - 2);
        cache[n - 2] = n2res;
        int n1res = XXX(n - 1);
        cache[n - 1] = n1res;

        return n2res + n1res;
    }
private:
    map<int, int> cache;
};

