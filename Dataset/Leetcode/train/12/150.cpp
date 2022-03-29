 class Solution {
public:
    string wholeToRoman(int digit, int mul) {
		if (mul == 1) {
			if (digit == 4) return "IV";
			else if (digit == 9) return "IX";
			else return string(digit, 'I');
		}
		else if (mul == 5) {
			return string(digit, 'V');
		}
		else if (mul == 10) {
			if (digit == 4) return "XL";
			else if (digit == 9) return "XC";
			else return string(digit, 'X');
		}
		else if (mul == 50) {
			return string(digit, 'L');
		}
		else if (mul == 100) {
			if (digit == 4) return "CD";
			else if (digit == 9) return "CM";
			else return string(digit, 'C');
		}
		else if (mul == 500) {
			return string(digit, 'D');
		}
		else if (mul == 1000) {
			return string(digit, 'M');
		}

        return "";
	}

	string XXX(int num) {
		vector<pair<int, int>> v;
		int i = 1;
		while (1) {
			int digit = num % 10;

			if (i == 1000) {
				v.push_back(make_pair(digit, i));
				break;
			}

			int apply_5 = digit / 5;
			int roman_mod = digit % 5;

			v.push_back(make_pair(roman_mod, i));
			v.push_back(make_pair(apply_5, i * 5));

			num = num / 10;
			i *= 10;
		}

		string ans;
		for (int i = v.size() - 1; i >= 0; i--) {
			if (i % 2 == 1){
				if (v[i - 1].first == 4) {
					v[i - 1].first += v[i].first * 5;
					v[i].first = 0;
				}
			}
			ans.append(wholeToRoman(v[i].first, v[i].second));
		}


		return ans;
	}
};

