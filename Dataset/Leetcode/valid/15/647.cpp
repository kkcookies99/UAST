 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        quickSort(nums,0,nums.size()-1);
        vector<vector<int>> ans;

        int len = nums.size();
        int l = 0;
        int r = len-1; 
        for(int i = 0; i<len;i++)
        {
            if(nums[i]>0)
            break;
            
            l = i+1;
            r = len-1;
            while(l<r)
            {
                if(nums[i]+nums[l]+nums[r]>0)
                {
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r]<0)
                {
                    l++;
                }
                else
                {
                    vector<int> temp;
                    temp.push_back(nums[i]);
                    temp.push_back(nums[l]);
                    temp.push_back(nums[r]);
                    ans.push_back(temp);
                    int tempr = nums[r];
                    
                    do
                    {
                        r--;
                    }
                    while(r>l&&nums[r]==tempr);

                    l++;
                }
            }
            while(i<len-1&&nums[i] == nums[i+1])
            {
                i++;
            }
        }
        return ans;
    }

    void quickSort(vector<int> &num, int l, int r)
    {
	if (l >= r)     //先检查左右条件
		return;
	int i = l, j = r, x = num[l];
	while (i < j) {
		while (i < j && num[j] >= x)//从右向左找到第一个小于x的值
			j--;
		if (i < j)
			num[i++] = num[j];//填坑之后i++
		while (i < j && num[i] <= x)//从左向右找第一个大于x的值
			i++;
		if (i < j)
			num[j--] = num[i];//填坑之后j--
	}
	num[i] = x;  //把选中的x放到i处
	quickSort(num, l, i - 1);//以i为中间值，分左右两部分递归调用
	quickSort(num, i + 1, r);
    }
};

