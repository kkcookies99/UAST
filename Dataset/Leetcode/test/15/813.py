 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:

        def XXX(lists, tgt):
            res = []
            unique_res = []
            set = {}
            n = len(lists)
            for i in range(n):
                if set.get(tgt - lists[i], None) == None:
                    set[lists[i]] = 1
                elif lists[i] not in unique_res:
                    res.append([lists[i], tgt - lists[i]])
                    unique_res.append(lists[i])
                    unique_res.append(tgt - lists[i])
            return res
        
        res = []
        while len(nums) > 2:
            part_sums = XXX(nums[1:], -nums[0])
            for ps in part_sums:
                res.append(ps + [nums[0]])
            nums = [nums[i] for i in range(len(nums)) if nums[i] != nums[0]]
            
        return res


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


