 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        quickSort(0,nums.size()-1,nums);
    vector<vector<int>> result;
	int m=0;
	for(int i=0;i<nums.size();i++){
		for(int j=i+1;j<nums.size();j++){
			for(int k=j+1;k<nums.size();k++){
				if(nums[i]+nums[j]+nums[k]==0){
					result.push_back({nums[i],nums[j],nums[k]});
					break;//寻找为0结果
				}
			}
		}
	}
	sort(result.begin(), result.end());
	result.erase(unique(result.begin(),result.end()),result.end());//迭代器消除重复项
        return result;
    }

void quickSort(int left, int right, vector<int>& arr)
{
	if(left >= right)
		return;
	int i, j, base, temp;
	i = left, j = right;
	base = arr[left];  
	while (i < j)
	{
		while (arr[j] >= base && i < j)
			j--;
		while (arr[i] <= base && i < j)
			i++;
		if(i < j)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	arr[left] = arr[i];
	arr[i] = base;
	quickSort(left, i - 1, arr);
	quickSort(i + 1, right, arr);
    }

};

