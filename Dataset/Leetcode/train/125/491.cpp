 class Solution {
public:
    char valid_char(char c) {
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
            return c;
        }
        if ((c >= 'A' && c <= 'Z')) {
            return c - ('A' - 'a');
        }

        return '-';
    }
    bool XXX(string s) {
        int len = s.length();
        if (len == 0) {
            return true;
        }

        char temp_l;
        char temp_r;
        for (int i = 0, j = len - 1; i <= j; i++, j--) {
            while (i < len && (temp_l = valid_char(s[i])) == '-') {
                i++;
            }
            while (j > -1 && (temp_r = valid_char(s[j])) == '-') {
                j--;
            }
            // cout << "i:" << i<< "-" <<  temp_l << ", j:" << j<< "-" <<temp_r << endl;
            if (i < j) {
                if (temp_l != temp_r) {
                    return false;
                }
            } else if (i == j) {
                return true;
            } else {
                return true;
            }
            

        }

        return true;
    }
};

