 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return []
        def target(List,item,result):
            if not List:
                result.append(item[::])
            else:
                item.append(List[0])
                target(List[1:],item,result)
                item.pop()
                target(List[1:],item,result)
            return result
        result = target(nums,[],[])
        return result

