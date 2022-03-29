class Solution {
public:
    unordered_map<int, int>saved;
    int XXX(int n) {
        if(n<0)return 0;
        if(!n)return 1;
        if(saved.find(n)!=saved.end())return saved[n];
        int num = XXX(n-1)+XXX(n-2);
        saved[n]= num;
        return  num;
    }
};

