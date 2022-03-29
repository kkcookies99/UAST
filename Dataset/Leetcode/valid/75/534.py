 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        self.quick_sorted_3(nums, 0, len(nums)-1)
        
    def quick_sorted_3(self, nums, low, high):
        if low >= high:
            return
        a = i = low
        b = high
        pivot = nums[low]
        while i <= b:
            if nums[i] < pivot:
                nums[a], nums[i] = nums[i], nums[a]
                a += 1
                i += 1
            elif nums[i] > pivot:
                nums[b], nums[i] = nums[i], nums[b]
                b -= 1
            else:
                i += 1
        self.quick_sorted_3(nums, low, a - 1)
        self.quick_sorted_3(nums, b + 1, high)

