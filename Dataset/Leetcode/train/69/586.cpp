class Solution {
public:
    int XXX(int x) {
        if(x == 0) return 0;
        uint64_t i = 1; //头指针
        uint64_t j = x; //尾指针
        uint64_t middle = (i+j)/2; //中间指针
        uint64_t m = 0, n = 0;
        while(true)
        {
            m = (middle-1)*(middle-1);
            n = middle*middle;          
            if(m <= x && n >= x) break;
            else if(m > x && n > x) j = middle -1;
            else if(m < x && n <x)  i = middle +1;
            middle = (i+j)/2;
        }
        if(m == x || (m < x && n > x)) return middle-1;
        else if(n == x) return middle;

        return middle;
    }
};

