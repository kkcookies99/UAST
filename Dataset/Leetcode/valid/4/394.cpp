 double XXX(vector<int>& nums1, vector<int>& nums2)
{
	int i = 0, j = 0;
	double midnum = 0;
	vector<int> ret;
	while(i < nums1.size() || j < nums2.size())
	{
		if (i >= nums1.size())//如果nums1遍历结束，那么将nums2中剩下的元素都添加到ret数组中
		{
			ret.push_back(nums2[j]);
			j++;
			continue;
		}
		else if(j >= nums2.size())//如果nums2遍历结束，那么将nums2中剩下的元素都添加到ret数组中
		{
			ret.push_back(nums1[i]);
			i++;
			continue;
		}

                //判断哪个数组中的元素小就添加到ret数组中
		if (nums1[i] >= nums2[j])
		{
			ret.push_back(nums2[j]);
			j++;
		}
		else
		{
			ret.push_back(nums1[i]);
			i++;
		}
	}

        //计算中位数
	if (ret.size() % 2 == 0)
	{
		midnum = (ret[(ret.size() - 1) / 2] + ret[ret.size() / 2]) / 2.0;
	}
	else
	{
		midnum = ret[(ret.size() - 1) / 2]*1.0;
	}
	return midnum;
}

