public int XXX(int[] nums) {
		int[] nums1 = new int[nums.length + 1];
		nums1[0] = 0;
		for(int i = 0; i < nums.length; i++) {
			nums1[i + 1] = nums[i] + nums1[i];
		}

		int maxProfit = getMaxProfit(nums1);
		if(maxProfit == Integer.MIN_VALUE) {
			// 这种情况表明价格在一直下跌，需要取nums里面最小值
			for(int i = 0;  i < nums.length; i++) {
				if(maxProfit < nums[i]) {
					maxProfit = nums[i];
				}
			}
		}

		return maxProfit;
	}

	private int getMaxProfit(int[] prices) {
		int maxProfit = Integer.MIN_VALUE;
		int minPrice = prices[0];

		for(int i = 1; i < prices.length; i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
			} else if(maxProfit < prices[i] - minPrice) {
				maxProfit = prices[i] - minPrice;
			}
		}

		return maxProfit;
	}

