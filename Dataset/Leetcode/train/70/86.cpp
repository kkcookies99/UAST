class Solution {
public:
    int XXX(int n) {
        if(n <= 2){return n;}
        vector<int> df(n+1);
        df[1] = 1;
        df[2] = 2;
        for(int i = 3; i < n+1; i++){
            df[i] = df[i-1] + df[i-2];
        }
        return df[n];
    }
};
简练版：
class Solution {
public:
    int XXX(int n) {
        if(n <= 2){return n;}
        int l1 = 1,   l2 = 2,  temp = 0;
        while(n > 2){
            temp = l1 + l2;
            l1 = l2;
            l2 = temp;
            n--;
        }
        return l2;
    }
};

