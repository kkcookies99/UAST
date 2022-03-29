class Solution:
    def XXX(self, prices: List[int]) -> int:
        ans = 0
        l = len(prices) - 1
        stack = []   #单调递减栈
        while l >= 0:
            if stack == []:
                stack.append(prices[l])
            else:
                if prices[l] < stack[-1]:  #小于则加入
                    stack.append(prices[l])
                else:   #大于则pop到小于或者stack为空
                    while stack != []:
                        stack.pop()
                        if stack == []:
                            break
                        if prices[l] < stack[-1]:
                            stack.append(prices[l])
                            break
                    if stack == []:
                        stack.append(prices[l])
            if len(stack) >= 2:  #计算当前获利，和ans比较
                ans = max(ans, stack[0] - stack[-1])
            l -= 1
        return ans

