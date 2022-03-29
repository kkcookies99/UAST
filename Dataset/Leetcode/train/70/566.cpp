class Solution {
public:
    int XXX(int n) 
    {
        if(n <= 1) return n;
        vector<int> dp(n+1,0);
        int first = 0,second = 1,third = 2;     
        for(int i = 3; i<= n; i++)
        {
            first = second;
            second = third;
            third = first + second;
        }
        return third;
    }
};

