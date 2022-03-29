 class Solution {
public:
    string XXX(int num) {
        static const int ROMAN_TABLE[] = {1, 5, 10, 50, 100, 500, 1000};
        static const char ROMAN_CHAR[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        static const int SPECAIL_ROMAN_TABLE[] = {1, 4, 9, 40, 90, 400, 900};
        static const char SPECAIL_ROMAN_CHAR[] = {'I', 'I', 'I', 'X', 'X', 'C', 'C'};
        std::string roman;
        
        for (int i = 6; i >= 0; i--) {
            if (num >= SPECAIL_ROMAN_TABLE[i]) {
                if (num >= ROMAN_TABLE[i]) {
                    roman.push_back(ROMAN_CHAR[i]);
                    num -= ROMAN_TABLE[i];
                    i++;
                    continue;
                } else {
                    num -= SPECAIL_ROMAN_TABLE[i];
                    roman.push_back(SPECAIL_ROMAN_CHAR[i]);
                    roman.push_back(ROMAN_CHAR[i]);
                }
            }
        }
        
        return roman;
    }
};

