class Solution {
public:
	void print(vector<int> vec)
	{
		for (auto i : vec) {

			std::cout << i << " ";
		}
		std::cout << "\n";
	}

	int XXX(int x) {
        
        
         if (x > INT_MAX || x < INT_MIN ) {
			return 0;
		}
	    
  
	
		int ret = 0;

		vector<int> vec;
		int multi = 1;
		bool flag_fushu= false;
		if (x < 0)
		{
			flag_fushu = true;
            x = abs( x );
            std::cout <<"after abs    " <<x <<std::endl;
		}

		for (int i = 0; i < 10; i++)
		{
			vec.push_back(  abs( x / multi % 10));

			if (i != 9)
				multi = multi * 10;
		}
		std::cout << "原始" << std::endl;
		print(vec);

		bool first_flag = false;


		std::cout << "正向擦除" << std::endl;
		for (vector<int>::iterator it = vec.begin(); it != vec.end(); )
		{
			if (*it == 0)
			{
				it = vec.erase(it);
				print(vec);
				continue;
			}
			else
			{

				break;
			}
		}

		std::cout << "反向擦除" << std::endl;


		std::vector< int >::XXX_iterator i = vec.rbegin();
		while (i != vec.rend()) {
			if (*i == 0) {
				i = decltype(i)(vec.erase(std::next(i).base()));
				print(vec);
			}
			else {
				break;
			}
		}

		std::cout << "size : " << vec.size() << std::endl;
		i = vec.rbegin();
		int mult = 1;
		string last;
		//std::XXX(vec.begin(), vec.end());
		for (int i : vec) {
			//last.insert(0,std::to_string(i));
			last.append(std::to_string(i));
		}
		std::cout << last << std::endl;
        
        
        
        // 如何确保不越界???
		long l_ret = atol(last.c_str());

		std::cout << l_ret <<std::endl;
        
        if (flag_fushu)
		{
			ret = 0 - ret;
		}
	    if (l_ret > INT_MAX || l_ret < INT_MIN ) {
			return 0;
		}
	    
        ret = static_cast<int>(l_ret); 
		  
        if (flag_fushu)
		{
			ret = 0 - ret;
		}
        
		return ret;
	}
};


