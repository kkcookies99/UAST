 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        if (digits.size() < 1)
			return digits;

		if (digits[0] == 0)
		{
			digits[0] = 1;
			return digits;
		}

		auto it = digits.rbegin();
		if ((*it) <= 8)
		{
			(*it) += 1;
			return digits;
		}

		while (it != digits.rend())
		{
			(*it) = 0;
			it++;

			if (it != digits.rend())
			{
				(*it) += 1;
				if ((*it) < 10)
					break;
			}
		}

		if (it == digits.rend())
			digits.insert(digits.begin(), 1);

		return digits;
    }
};

