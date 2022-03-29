 class Solution {
public:
    int XXX(string s) {
	int i = 0;//记录循环
	int s_max = 0;//返回值，在每次迭代中更新
    int start=0;//记录起始点
	unordered_map<int, int>map;
	while (i < s.size())
	{
        auto it=map.find(s[i]);
        //如果是最近的重复字符，则1.更新起始点，2.将该字符的位置移到最新出现的位置。如果不是最近的，仅进行第2步操作。
        //如果不是重复字符，则加入到map
		if (it != map.end())
		{
            if(it->second>=start)  start=it->second+1;
            it->second=i;  
		}
		else 
        {
            map.insert(pair<int,int>(s[i], i));
        }
		if ((i-start+1) > s_max) s_max = i-start+1;
        i++;	
	}
	 return s_max;
    }
};

