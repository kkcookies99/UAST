class Solution {
public:
    string XXX(string a, string b) {
        if (a.size() > b.size()) {
            swap(a, b);
        }
        int shortenLen = a.size();
        int longerLen = b.size();
        
        int carriage = 0;
        int index = 0;
        while (index < shortenLen) {
            int acc = a[shortenLen-1-index] - '0' + b[longerLen-1-index] - '0' + carriage;
            carriage = acc / 2;
            b[longerLen-1-index] = acc % 2 + '0';
            ++index;
        }
        
        while (carriage && index < longerLen) {
            int acc = b[longerLen-1-index] - '0' + carriage;
            carriage = acc / 2;
            b[longerLen-1-index] = acc % 2 + '0';
            ++index;
        }
        
        if (index >= longerLen) {
            return carriage ? string("1") + b : b;
        } else {
            return b;
        }
    }
};

