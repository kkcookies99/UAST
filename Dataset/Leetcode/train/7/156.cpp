class Solution {
public:
    int XXX(int x) {
        long long num=0;
        while(x)
        {
            if(num>(pow(2,31)-1)||num<(-pow(2,31)))
                return 0;
            num=num*10+x%10;
            x/=10;
        }
        if(num>(pow(2,31)-1)||num<(-pow(2,31)))
                return 0;
        return (int)num;
    }
};

