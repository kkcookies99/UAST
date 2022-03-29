 func XXX(nums1 []int, nums2 []int) float64 {
	maxNumLen := len(nums1)
	miniNumLen := len(nums2)
	if miniNumLen > maxNumLen {
		nums1, nums2 = nums2, nums1
		maxNumLen, miniNumLen = miniNumLen, maxNumLen
	}
	imin := 0
	imax := miniNumLen
	for imin <= imax {
		i := (imin + imax) / 2
		j := ((miniNumLen + maxNumLen + 1) / 2) - i
		if i < imax && nums1[j-1] > nums2[i] {
			imin = i + 1
		} else if i > imin && nums2[i-1] > nums1[j] {
			imax = i - 1
		} else {
			max := func(num1 int, num2 int) int {
				if num1 > num2 {
					return num1
				}
				return num2
			}
			min := func(num1 int, num2 int) int {
				if num2 == 0 || (num1 < num2 && num1 != 0) {
					return num1
				}
				return num2
			}
			var maxLeft int
			if i == 0 {
				maxLeft = nums1[j-1]
			} else if j == 0 {
				maxLeft = nums2[i-1]
			} else {
				maxLeft = max(nums2[i-1], nums1[j-1])
			}
			if (miniNumLen+maxNumLen)%2 == 1 {
				return float64(maxLeft)
			}
			var minRight int
			if i == miniNumLen {
				minRight = nums1[j]
			} else if j == maxNumLen {
				minRight = nums2[i]
			} else {
				minRight = min(nums1[j], nums2[i])
			}
			return float64(maxLeft+minRight) / 2.0
		}
	}
	return 0.0
}

