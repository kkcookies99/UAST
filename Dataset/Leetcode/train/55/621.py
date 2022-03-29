 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        steps = nums
        for v in range(len(steps)):
            if steps[v]== 0 and v != len(steps) - 1:
                dis = [i for i in range(1, v+1)][::-1]
                temp_steps = steps[:v]
                result = [i-j for i,j in zip(temp_steps, dis)]
                print(result)
                result = any([v>0 for v in result])
                if not result:
                    return False
        return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


