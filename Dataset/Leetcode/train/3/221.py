 def XXX(self, s: str) -> int:
        # 历史最长
        current_max = ""
        # 维护当前最长字符列表
        st = []
        # 创建移动指针
        flag2 = 0
        flag = 0
        while flag2 < len(s):
            if s[flag2] not in st:
                st.append(s[flag2])
                flag2 += 1
            else:
                if len(st) > len(current_max):
                    current_max = "".join(st)
                st = []
                flag += 1
                flag2 = flag
        if len(st) > len(current_max):
            current_max = ''.join(st)
        return len(current_max)

