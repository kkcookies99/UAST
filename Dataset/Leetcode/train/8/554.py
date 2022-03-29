 class Solution:
    def XXX(self, s: str) -> int:
        string_to_int_map = {
            '1': 1,
            '2': 2,
            '3': 3,
            '4': 4,
            '5': 5,
            '6': 6,
            '7': 7,
            '8': 8,
            '9': 9,
            '0': 0
        }
        is_negative = False
        is_stated = False
        result = 0
        # max_value = 2 ** 31 - 1
        max_value = 2147483647
        for s_item in s:
            if s_item == ' ' and not is_stated:
                continue
            if s_item == '-':
                if is_stated:
                    return -result if is_negative else result
                is_negative = True
                is_stated = True
                continue
            elif s_item == '+':
                if is_stated:
                    return -result if is_negative else result
                is_stated = True
                continue
            item_int = string_to_int_map.get(s_item)
            if item_int is None:
                # 其他的特殊字符
                return -result if is_negative else result
            result = result * 10 + item_int
            # [-2^31, 2^31 - 1]
            if is_negative and result > max_value:
                return -max_value - 1
            if not is_negative and result >= max_value:
                return max_value
            is_stated = True
        return -result if is_negative else result



