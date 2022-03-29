class Solution {
public:
    string XXX(string a, string b) {
        int lenA = a.size();
        int lenB = b.size();
        string res(max(lenA,lenB) + 1,'0');
        int carry = 0;
        for(int i = res.size()-1; i >= 0; i--){
            lenA--;
            lenB--;
            int aTemp = lenA >= 0 ? a[lenA]-'0' : 0;
            int bTemp = lenB >= 0 ? b[lenB]-'0' : 0;
            res[i] = (aTemp+bTemp+carry) > 1 ? aTemp+bTemp+carry-2+'0' : aTemp+bTemp+carry+'0';
            carry = (aTemp+bTemp+carry) > 1 ? 1 : 0;
          
        }
        return res[0] == '0' ? res.substr(1) : res;    
    }
};

