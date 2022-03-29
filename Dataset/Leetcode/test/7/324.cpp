class Solution {
public:
	int XXX(int x) {
		if (x == 0)
			return 0;
		try
		{
			string s = to_string(x);
			if (s[0] == '-')
				std::XXX(s.begin() + 1, s.end());
			else
				std::XXX(s.begin(), s.end());
			return stoi(s);
		}
		catch (std::out_of_range e)
		{
			return 0;
		}	
	}
};

