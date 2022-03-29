class Solution {
public:
    int XXX(int x) {
        long i=0;
        while(true)
        {
            if(i*i>x)
                break;
            i++;
        }
        return (int)i-1;
    }
};

