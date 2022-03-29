 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        import random
        import math
        import json
        
        res = set()
        n = math.factorial(len(nums))

        while len(res) != n:
            random.shuffle(nums)
            res.add(json.dumps(nums))
    
        return [json.loads(i) for i in res]

