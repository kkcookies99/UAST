class Solution {
public:
    int XXX(int x) {
        string result = to_string(x);
        std::XXX(result.begin(), result.end());

        int tag = 1;

        if (result[result.size() - 1] == '-')
        {
            result.pop_back();
            tag = -1;
        }

        if (result.size() >= 10 && result > "2147483647")
        {
            result = "0";
        }

        return atoi(result.c_str()) * tag;
    }
};


