class Solution {
public:
	int XXX(string str) {
		int level = 10;
		signed int result = 0;
		bool signFlag = false;
		bool nevigateFlag = false;
		bool numberFlag = false;
		for (int i = 0; i < str.length(); i++) {
			if (nevigateFlag == false && str[i] == ' ') {
				if (numberFlag == false && signFlag == false) {
					continue;
				}
				else {
					break;
				}
			}
			if (numberFlag == false && signFlag == false && str[i] == '-') {
				nevigateFlag = true;
				signFlag = true;
			}else if (numberFlag == false && signFlag == false && str[i] == '+') {
				nevigateFlag = false;
				signFlag = true;
			}
			else if (str[i] >= 48 && str[i] <= 57) {
				numberFlag = true;
				int temp = nevigateFlag ? -result : result;
				if ((temp > INT_MAX / 10 || temp < INT_MIN / 10) || 
					(temp == INT_MAX / 10 && str[i] - '0' >= 7) || 
					(temp == INT_MIN / 10 && str[i] - '0' >= 8)
					) {
					return nevigateFlag ? INT_MIN : INT_MAX;
				}

				result = level * result + (str[i] - '0');
			}
			else {
				break;
			}
		}
		return nevigateFlag ? -result : result;
	}
};

