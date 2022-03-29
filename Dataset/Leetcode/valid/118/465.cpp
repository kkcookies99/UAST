 class Solution {
public:
    vector<vector<int>> XXX(int x) 
    {
        vector<vector<int> > vec;

		if(x == 0)return vec;

		vector<int> vec1;
		vec1.push_back(1);
		vec.push_back(vec1);

		if(x == 1)return vec;

		vector<int> vec2;
		vec2.push_back(1);
		vec2.push_back(1);
		vec.push_back(vec2);

		if(x == 2)return vec;

		for(int i = 2;i < x;++i)
		{
			vec1.clear();
			for(unsigned k = 0;k < vec2.size();++k)
			{
				vec1.push_back(vec2[k]);
			}
			vec2.clear();
			vec2.push_back(1);
			for(int j = 0;j < i - 1;++j)
			{
				vec2.push_back(vec1[j] + vec1[j + 1]);
			}
			vec2.push_back(1);
			vec.push_back(vec2);
		}
		
		return vec;
    }
};

