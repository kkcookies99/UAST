 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums = nums1 + nums2
        len_ = len(nums)
        if len_ % 2 == 0:
            half_index2 = len_ // 2
            half_index1 = half_index2 - 1
            item2 = self.find_k_largest(nums, half_index2)
            item1 = self.find_k_largest(nums, half_index1)
            med = (item1 + item2)/2
            return med
            
        else:
            half_index = len_ // 2
            return self.find_k_largest(nums, half_index)
        
    
    def quick_sort_partition(self, arr, low, high):
        pivot = arr[low]
        while low < high:
            while low < high and arr[high] >= pivot:
                high = high - 1
            if low < high:
                arr[low] = arr[high]
            while low < high and arr[low] < pivot:
                low = low + 1
            if low < high:
                arr[high] = arr[low]
        arr[low] = pivot
        return low,pivot
    def find_k_largest(self,arr,k):
        len_ = len(arr)
        return self.find_k_largest_partition(arr, k, 0, len_ - 1)
    def find_k_largest_partition(self, arr, k, low, high):
        n,pivot = self.quick_sort_partition(arr, low, high)
        if n == k:
            return pivot
        elif n < k:
            return self.find_k_largest_partition(arr,k, n + 1, high)
        else:
            return self.find_k_largest_partition(arr,k, low, n)
        

