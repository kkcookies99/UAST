 class Solution {
public:
	vector<int> XXX(vector<int>& digits) {
		if (digits[digits.size() - 1] + 1 < 10){//最后一位小于9，直接冲
			digits[digits.size() - 1] += 1;
			return digits;
		}
		int flag = 1;//设置进位标志位，既然最后一位已经是9了，那肯定会产生进位的，直接设为1
		for (int i = digits.size()-1; i >= 0; i--){
			if (digits[i] + flag >= 10){//如果需要持续产生进位，那就继续比如9999的情况
				flag = 1;
				digits[i] = (digits[i] + 1) % 10;
			}
			else{//不再产生进位，就差不多的了
				digits[i] = digits[i] + 1;
				return digits;
			}
		}
		if (flag == 1){/最后还有进位没消掉，逆置+1再逆置
			reverse(digits.begin(), digits.end());
			digits.push_back(1);
			reverse(digits.begin(), digits.end());
		}
		return digits;
	}
};

