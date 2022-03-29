 class Solution {
public:
    string XXX(int num) {
        vector<vector<string>> RomanList = 
        {{"I","IV","V","V","IX"},{"X","XL","L","L","XC"},{"C","CD","D","D","CM"},{"M","","","",""}};
        
        vector<int> ApartNum;
        while(num > 0) {
            ApartNum.push_back(num % 10);
            num /= 10;
        }
        
        string ans;
        for (int i = ApartNum.size() - 1; i >= 0; --i) {
            if (ApartNum[i] < 4) {
                for (int j = 0; j < ApartNum[i]; ++j) ans += RomanList[i][0];
                continue;
            }
            if (ApartNum[i] == 4) {
                ans += RomanList[i][1];
                continue;
            }
            if (ApartNum[i] == 5) {
                ans += RomanList[i][2];
                continue;
            }
            if (ApartNum[i] < 9) {
                ans += RomanList[i][3];
                for (int j = 0; j < ApartNum[i] - 5; ++j) ans += RomanList[i][0];
                continue;
            }
            if (ApartNum[i] == 9) {
                ans += RomanList[i][4];
                continue;
            }
        }

        return ans;
    }
};

