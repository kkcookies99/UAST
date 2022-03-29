 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        records = dict()

        # 用枚举更方便，就不需要通过索引再去取当前位置的值
        for idx, val in enumerate(nums):
            if target - val not in records:
                records[val] = idx
            else:
                return [records[target - val], idx] # 如果存在就返回字典记录索引和当前索引

