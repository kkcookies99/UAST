 class Solution {
public:
    string XXX(string str, int numRows) 
    {
        if(numRows == 1)return str;

	int strsize = str.size();
	vector<vector<char> > vec(numRows,vector<char>(strsize));

	int i,j = 0;
	int istr = 0;
	while(1)
	{
		i = 0;
		while(i < numRows)
		{
			if(istr == strsize)break;
			vec[i++][j] = str[istr++];
		}
		if(istr == strsize)break;
		i -= 2;
		++j;
		while(i != 0)
		{
			if(istr == strsize)break;
			vec[i--][j++] = str[istr++];
		}
		if(istr == strsize)break;
	}
		
	string strtemp = "";
	int nLength1 = vec.size();
	int nLength2 = vec[0].size();
	for(int i = 0;i < nLength1;++i)
	{
		for(int j = 0;j < nLength2;++j)
		{
			if(vec[i][j] != 0)
			{
				strtemp.push_back(vec[i][j]);
			}
		}
	}

	return strtemp;
    }
};

