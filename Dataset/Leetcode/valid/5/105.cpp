 class Solution {
public:
    string XXX(string s) {
        if (s.length()<= 1) return s;
        int lenMax= 0, left= 0;
        for (int i= 0; i< s.length(); i++) {
            int len1= expand(s, i, i);
            int len2= expand(s, i, i+ 1);
            int len= (len1> len2)?len1:len2;
            if (len> lenMax) {
                lenMax= len;
                left= i- (lenMax- 1)/ 2;
            }
        }
        return s.substr(left, lenMax);
    }
    
    int expand(string &s, int left, int right) {
        int l= left, r= right;
        while (l>= 0 && r< s.length() && s[l]== s[r]) {
            --l;
            ++r;
        }
        return r- l- 1;
    }
};

