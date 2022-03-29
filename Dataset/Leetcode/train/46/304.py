class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        if n==1:
            return [nums]
        
        res=[]
        def helper(unused_arr,temp_list):
            if len(temp_list)==n:
                res.append(temp_list)
                return
            for i in range(len(unused_arr)):
            
                helper(unused_arr[:i]+unused_arr[i+1:],temp_list+[unused_arr[i]])
        helper(nums,[])
        return res
            

