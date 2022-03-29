 class Solution {
public:
    vector<string> XXX(int n) {
        return enumerate(n);
    }
    vector<string> enumerate(int n)
    {
        if (n == 0)
            return vector<string> (0);
        if (n == 1)
            return vector<string> (1,"()");
        vector<string> s(enumerate(n - 1));
        int size = s.size();
        vector<string> result(3*size-1);
        for (int i = 0; i < size; i++)
        {
            result[i] = '(' + s[i] + ')';
        }

        for (int i = 0; i < size; i++)
        {
            result[i+size] = s[i] + "()";
        }
        for (int i = 0; i < size - 1; i++)
        {
            result[i+2*size] = "()" + s[i];
        }
        return result;
    }
};

