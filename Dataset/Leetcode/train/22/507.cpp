 class Solution {
public:
   int bits(int n){
		int res = 0;
		while (n)
		{
			n = n&(n - 1);
			res++;
		}
		return res;
	}
    //使用位运算模拟所有可能出现的情况，1代表（ ,0代表 ）
	vector<string> XXX(int n) {
		vector<string>Parenthesis;
		for (int i = 0; i < (1 << (2*n)); i++){
			if (bits(i) == n){  // 1 和 0 数量相同时
				int t = i;
				int count = 0;  //左括号现有的数量
				bool ist = true; //左括号数量大于等于右括号
				string s;
				for (int j = 0; ist&&j < 2 * n;j++){
					if (t % 2){
						count++;
						s.push_back('(');
					}
					else{
						if (count){
							count--;
							s.push_back(')');
						}
						else
						{
							ist = false;
						}
					}
					t = t / 2;
				}
				if (ist){
					Parenthesis.emplace_back(s);
				}
			}
		}
		return Parenthesis;

	}

};

