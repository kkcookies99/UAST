 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        t = []
        s = 0
        nums.sort()
        def bt(nums,s):
            if len(t) == 3:
                if sum(t) == 0 and t not in res:
                    res.append(t[:])
                return
            for i in range(s,len(nums)):
                t.append(nums[i])
                bt(nums,i+1)
                t.pop()
        bt(nums,s)
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


