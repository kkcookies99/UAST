 class Solution {
public:
    string XXX(string s) {
        string result = "";
        for(int i = 0; i < s.size(); ++i)
        {
            string total = "";
            int left = i - 1,right = i;
            while((right < s.size() && s.at(right) == s.at(i))) 
            {
                total += s.at(right++);
            }
            while(left >= 0 && right < s.size() && s.at(left) == s.at(right))
            {
                total = s.at(left--) + total + s.at(right++);
            }
            if(total.size() > result.size()) result = total;
        }
        return result;
    }
};

