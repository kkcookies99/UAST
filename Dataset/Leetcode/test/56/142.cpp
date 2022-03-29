 class Solution {
public:
    static bool cmp1(vector<int> &a, vector<int> &b)
    {
        return a[0] < b[0] || (a[0] == b[0] && a[1] < b[1]);
    }
    vector<vector<int> > XXX(vector<vector<int> > &input)
    {
        vector<vector<int> > output;
        sort(input.begin(), input.end(), cmp1);
        if (input.size() == 0)
            return output;
        else
            output.push_back(input[0]);
        for (int i = 1; i < input.size(); i++)
        {
            if (input[i][0] > output[output.size() - 1][1])
            {
                output.push_back(input[i]);
            }
            else
                output[output.size() - 1][1] = max(input[i][1],output[output.size() - 1][1]);
        }
        return output;
    }

};

