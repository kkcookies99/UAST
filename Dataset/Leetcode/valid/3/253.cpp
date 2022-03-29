 class Solution {
public:
	int XXX(string s) {
		unordered_map <char, size_t> m;
		size_t max=0;
		size_t i = 0;
		size_t j = 0;
		while (j<s.size())
		{
			if (max < m.size())
				max = m.size();
			if (m.find(s[j]) == m.end()) {
				m[s[j]]++;
				j++;
			}
			else
			{
				m.erase(m.begin());
				i++;
				j = i+max-1;
			}
		}
		if (max < m.size())
			max = m.size();
		return max;
	}
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

