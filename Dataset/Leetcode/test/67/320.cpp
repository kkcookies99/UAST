 class Solution {
public:
    string XXX(string a, string b) {
        string res = "";
        int carry = 0, bitSum = 0;
        int i = a.size() - 1, j = b.size() - 1;
        while(carry || i != -1 || j != -1){
            bitSum += carry;
            if(i >= 0 && a[i--] == '1') bitSum++;
            if(j >= 0 && b[j--] == '1') bitSum++;
            res += '0' + bitSum % 2;
            carry = bitSum / 2;
            bitSum = 0;
        }
        reverse(res.begin(), res.end());
        return res;
    }
};

