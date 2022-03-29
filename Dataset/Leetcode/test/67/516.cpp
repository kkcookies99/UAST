class Solution {
public:
    string XXX(string a, string b) 
    {
        int i = a.size() - 1;
        int j = b.size() - 1;
        int carry = 0;
        string S;
        while(i >= 0 || j >= 0||carry !=0)
        {
            int s0 = i >=0 ? a[i] -'0' :0;
            int s1 = j >=0 ? b[j] -'0':0;
            int num = s0 + s1 + carry;
            carry = num/2;
            num = num %2;
            S += num + '0';
            i--;
            j--;
        }
        reverse(S.begin(), S.end());
        return S;
    }
};

