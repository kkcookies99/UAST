 def XXX(self, n: int) -> List[str]:
    result = []
	
    # left_p_num为左括号的剩余数量
    # right_p_num为右括号的剩余数量
    def backtrace(path, left_p_num, right_p_num):
        if left_p_num == 0 and right_p_num == 0:
            result.append(path)
        else:
            if left_p_num > 0:
                backtrace(path + '(', left_p_num - 1, right_p_num)
            if left_p_num < right_p_num:
                backtrace(path + ')', left_p_num, right_p_num - 1)

    backtrace('', n, n)
    return result

