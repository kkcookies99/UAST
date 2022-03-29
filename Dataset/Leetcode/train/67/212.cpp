 class Solution {
public:
    char addBit(char c1, char c2, char carry)
    {
        if (c1 == '1' && c2 == '1' && carry == '1' || 
            c1 == '1' && c2 == '0' && carry == '0' ||
            c1 == '0' && c2 == '1' && carry == '0' ||
            c1 == '0' && c2 == '0' && carry == '1') return '1';
        return '0';
        // int a = c1 - '0', b = c2 - '0', c = carry - '0';
        // return (a + b + c) % 2 + '0';
    }

    char carryBit(char c1, char c2, char carry)
    {
        if (c1 == '1' && c2 == '1' && carry == '1' || 
            c1 == '1' && c2 == '1' && carry == '0' ||
            c1 == '0' && c2 == '1' && carry == '1' ||
            c1 == '1' && c2 == '0' && carry == '1') return '1';
        return '0';
        // int a = c1 - '0', b = c2 - '0', c = carry - '0';
        // return (a + b + c) / 2 + '0';
    }

    string XXX(string a, string b) {
        int na = a.size(), nb = b.size();
        string &longer = na > nb ? a : b;
        string &shorter = na > nb ? b : a;
        shorter = string(longer.size() - shorter.size(), '0') + shorter;
        string ans = "";
        int i = longer.size() - 1, j = shorter.size() - 1;
        char carry = '0';
        while (i >= 0)
        {
            ans = addBit(longer[i], shorter[j], carry) + ans;
            carry = carryBit(longer[i--], shorter[j--], carry);
        }
        if (carry == '1') ans = '1' + ans;
        return ans;
    }
};

