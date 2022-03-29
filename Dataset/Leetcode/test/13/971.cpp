 class Solution {
public:
    int XXX(string s) {

        std::map<char, int> dataIng{
            {'I', 1}, {'V', 5}, {'X', 10},
            {'L', 50}, {'C', 100}, {'D', 500},
            {'M', 1000}
        };  

        int res;
        auto size = s.size();
        int tmp;

        for (int i = 0; i < size; ++i)
        {
            tmp = dataIng[s[i]];
            if (i != size-1 &&  dataIng[s[i]] < dataIng[s[i+1]])
            {
                tmp = -tmp;
            }
            res += tmp;
        }

        return res;
    }
};

