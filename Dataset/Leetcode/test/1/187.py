 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        dict={}
        ans=[]
        idx=0
        for val in nums:
            diff=target-val
            if diff in dict:
                ans.append(dict[diff])
                ans.append(idx)
                break
            else:
                dict[val]=idx
                idx+=1
        return ans

