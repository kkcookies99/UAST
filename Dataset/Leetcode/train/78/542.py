 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
                return [list(tmp)  for i in range(len(nums)+1) for tmp in itertools.combinations(nums,i)]

