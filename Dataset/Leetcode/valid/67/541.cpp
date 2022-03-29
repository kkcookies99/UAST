class Solution {
public:
    string XXX(string a, string b) {
        string result = "";
	int len_a = a.length();
	int len_b = b.length();
	int flag = len_a>len_b?1:0;//flag 	1：a长   0：b长
	int len_arr = len_a>len_b?len_a+1:len_b+1;//len_arr = a和b中长的length
	int arr[len_arr];
	int len_sort = len_a>len_b?len_b:len_a;//短的
	string sorter;
	sorter = len_a>len_b?b:a; // 短的字符串
	memset(arr, 0, sizeof(len_arr));//初始化数组
	if (flag)//a长
	{
		for (int i = len_arr - 1; i > 0; --i)
		{
			/* code */
			arr[i] = (int)(a[i - 1] - '0');
		}
	}else{
		for (int i = len_arr - 1; i > 0; --i)
		{
			/* code */
			arr[i] = (int)(b[i - 1] - '0');
		}
	}
	//add
	int temp = 0;//进位
	int j = len_arr - 1;
	cout << "len_sort = " << len_sort << endl;
	for (int i = len_sort - 1; i >= 0; --i, --j)
	{
		/* code */
		cout << "j = " << j << endl;
		int sum = arr[j] + (sorter[i] - '0') + temp;
		arr[j] = sum % 2;
		temp = sum / 2;
	}
	cout << "j = " << j << endl;
	while(true)
	{
		if (temp == 0)
		{
			/* code */
			break;
		}
		int sum = arr[j] + temp;
		arr[j--] = sum % 2;
		temp = sum / 2;
	}
	int i = 0, ii = 0;
	if (arr[0] == 0)
	{
		/* code */
		i++;
	}
	for (; i < len_arr; ++i)
	{
		/* code */
		if (arr[i] != -1)
		{
			/* code */
			// result[ii++] = arr[i] + '0';
			result.push_back(arr[i] + '0');
		}
	}
	return result;
    }
};

