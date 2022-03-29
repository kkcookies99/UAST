class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        results = []
        
        XXX_size = 2 ** len(nums)

        n = 0
        while n < XXX_size:
            subset = []
            
            i = 0
            bits = n
            while bits > 0:
                if bits & 1 == 1:
                    subset.append(nums[i])
                i += 1
                bits = bits >> 1
            
            n += 1
            results.append(subset)
        
        return results

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


