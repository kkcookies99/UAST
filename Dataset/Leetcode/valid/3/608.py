 class Solution:
    def XXX(self, s: str) -> int:  
        window = [] # 存储当前窗口字符
        max_length = 0

        for char in s:
            while char in window:
                window.pop(0)   # 如果在窗口中，移除左边字符
            window.append(char)   # 没有重复的字符则继续添加 
            max_length = max(len(window), max_length)    
        return max_length

