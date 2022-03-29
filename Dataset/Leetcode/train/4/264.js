func XXX(nums1 []int, nums2 []int) float64 {
	num := make([]int, 0)
	num = append(num, nums1...)
	num = append(num, nums2...)
	sort.Slice(num, func(i, j int) bool {
		return num[i] < num[j]
	})

	count := len(num)
	if count%2 == 0 {
		return float64((num[count/2-1] + num[count/2])) / 2
	} else {
		return float64(num[count/2])
	}
}