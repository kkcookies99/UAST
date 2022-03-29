 double XXX(vector<int>& nums1, vector<int>& nums2) {
        int m1=0, m2=0;
	auto i1 = nums1.begin();
	auto i2 = nums2.begin();
	int tsz = nums1.size() + nums2.size();

	for (int i = tsz / 2; i >= 0; --i)
	{
		m1 = m2;
		if (i1 >= nums1.end()) //nums1 完了
			m2 = *i2++;
		else if (i2 >= nums2.end()) //nums2 完了
			m2 = *i1++;
		else if (*i1 < *i2)
			m2 = *i1++;
		else
			m2 = *i2++;
	}

	return tsz % 2 ? m2 : (m1 + m2) / 2.0f; //根据定义，偶数个数返回中间两个数的平均值。m1就是干这个用的除此之外m1没鸟用
    }

