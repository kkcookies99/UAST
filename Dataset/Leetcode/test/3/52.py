 class Solution:
    def XXX(self, s: str) -> int:
        temp_arr, max_len = [], 0
        for i in s:
            if i in temp_arr:#当遇到有重复的元素时
                max_len = max(max_len, len(temp_arr))   
                # 删除前记录最大长度
                del temp_arr[:temp_arr.index(i) + 1] 
                # 这步关键，当遇到窗口遇到有重复时，删除"重复"和"重复前"的元素
            temp_arr.append(i)
        return max(max_len, len(temp_arr))  
        # 提交前再一遍看检查一遍

