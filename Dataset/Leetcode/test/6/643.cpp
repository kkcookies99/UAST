 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows==1) {return s;}
        string result="";
        int revRows=1;
        while (numRows) {
            int i=revRows-1;
            while (i<s.size()) {
                if (numRows != 1) {
                    result.insert(result.end(), s[i]);
                    i+= (numRows-1)*2;
                }
                if (i>=s.size()) {break;}
                if (revRows != 1) {
                    result.insert(result.end(), s[i]);
                    i+= (revRows-1)*2;
                }
            }
            numRows--;revRows++;
        }
        return result;
    }
};

