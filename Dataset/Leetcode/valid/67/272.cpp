 class Solution {
public:
    string XXX(string a, string b) {
        int carry = 0;
        int pos1 = a.size()-1;
        int pos2 = b.size()-1;
        string res;
        while(carry!=0||pos1>=0||pos2>=0){
            int sum = 0;
            if(carry!=0)
                sum += carry;
            if(pos1>=0){
                sum += a[pos1] - '0';
                pos1--;
            }
            if(pos2>=0){
                sum += b[pos2] - '0';
                pos2--;
            }
            res = to_string(sum % 2) + res;
            carry = sum / 2;
        }
        return res;
    }
};

