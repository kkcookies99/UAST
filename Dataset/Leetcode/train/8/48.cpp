class Solution {
public:
    inline int XXX(const string& str) {
        double result = 0;
        int IsPositive = 1;
        auto tmp_iterator = str.begin();
        while(*tmp_iterator == ' ')
            ++tmp_iterator;
        if(*tmp_iterator == '-')
        {
            IsPositive = -1;
            ++tmp_iterator;
        }
        else if(*tmp_iterator == '+')
            ++tmp_iterator;
        while(tmp_iterator<str.end() && 48<=*tmp_iterator && *tmp_iterator<=57)
            result = result*10-48+*tmp_iterator++;
        
        result *= IsPositive;
        if(result < INT_MIN)
            return INT_MIN;
        else if(result > INT_MAX)
            return INT_MAX;
        else
            return static_cast<int>(result);
    }
};

