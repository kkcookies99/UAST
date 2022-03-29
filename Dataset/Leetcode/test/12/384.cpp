 class Solution {
public:
	std::string XXX(int num) {
		std::vector<std::pair<int, std::string>> vct_roman_int;
		vct_roman_int.push_back(std::make_pair(1000, "M"));
		vct_roman_int.push_back(std::make_pair(900, "CM"));
		vct_roman_int.push_back(std::make_pair(500, "D"));
		vct_roman_int.push_back(std::make_pair(400, "CD"));
		vct_roman_int.push_back(std::make_pair(100, "C"));
		vct_roman_int.push_back(std::make_pair(90, "XC"));
		vct_roman_int.push_back(std::make_pair(50, "L"));
		vct_roman_int.push_back(std::make_pair(40, "XL"));
		vct_roman_int.push_back(std::make_pair(10, "X"));
		vct_roman_int.push_back(std::make_pair(9, "IX"));
		vct_roman_int.push_back(std::make_pair(5, "V"));
		vct_roman_int.push_back(std::make_pair(4, "IV"));
		vct_roman_int.push_back(std::make_pair(1, "I"));
		

		int num_target = num;
		std::string str_roman;
		for (auto vct_it = vct_roman_int.begin(); num_target > 0 && vct_it != vct_roman_int.end(); ++vct_it) {			
			while (num_target >= vct_it->first){
				num_target = num_target - vct_it->first;
				str_roman += vct_it->second;
			}
		
		}

		return str_roman;
	}
};

