 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        d = dict()
        count = 0
        
        for i in nums:
            d.setdefault(i, []).append(count)
            count += 1
            
            res = d.get(target - i, None)
            
            if res:
                if i != target - i:
                    return [res[0], d.get(i)[0]]
                    
                elif len(res) > 1:
                    return res

