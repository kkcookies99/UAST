 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        
        N = len(nums)
        if N<=2: return []
        res = set()
        
        # Put all negative numbers to the front.
        # Put all non-negative numbers to the end.
        i, j = 0, N-1
        count_zero = 0
        while i<=j:
            if nums[i]<0:
                i += 1
            else:
                if nums[i]==0: count_zero+=1
                nums[i], nums[j] = nums[j], nums[i]
                j -= 1

        # Number of negative numbers.
        n_neg = i
        
        def search(start_end1: Tuple[int], start_end2: Tuple[int]) -> None:
            start1, end1 = start_end1
            start2, end2 = start_end2

            value_set = set(nums[start1:end1])
            for j in range(start2, end2-1):
                for k in range(j+1, end2):
                    s = -(nums[j] + nums[k])
                    if s in value_set:
                        if nums[j] > nums[k]:
                            res.add((nums[j], nums[k], s))
                        else:
                            res.add((nums[k], nums[j], s))
        
        # 1 number from negative part, 2 numbers from non-negative part.
        search((0, n_neg), (n_neg, N))
        # 1 number from non-negative part, 2 numbers from negative part.
        search((n_neg, N), (0, n_neg))
        # 3 numbers from non-negative part, namely they are all zeros
        if count_zero>=3: res.add((0, 0, 0))

        return list(res)

