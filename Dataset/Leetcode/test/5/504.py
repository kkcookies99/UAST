 class Solution:
    def XXX(self, s: str) -> str:
        queue = deque()
        ans = s[0]
        '''
        考虑到字符可能是奇数长度和偶数长度，所以在一开始
        需要将每一个字符（s的首尾字符只需要选择一个加入），
        以及相邻字母相同的双字符加入队列中
        '''
        for i in range(len(s)-1):
            queue.append((i, i))
            if s[i] == s[i+1]:
                ans = s[i:i+2]
                queue.append((i, i+1))
        
        '''
        进行广度优先搜索，搜索过程中记录最长的回文子字符串
        '''
        while len(queue) > 0:
            left, right = queue.popleft()
            left -= 1
            right += 1
            if left >= 0 and right <= len(s) - 1:
                if s[left] == s[right]:
                    if len(ans) < right - left + 1:
                        ans = s[left:right+1]
                    queue.append((left, right))
        
        return ans

