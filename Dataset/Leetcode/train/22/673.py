 class Solution:
    def XXX(self, n: int) -> List[str]:
      ans = []
      
      max_n = n
      max_unclosed = n
      ans.append(("", n, 0))
      while(max_n > 0 or max_unclosed > 0):
        max_n = 0
        max_unclosed = 0
        tmp = []
        for case in ans:
          s = case[0]
          pairs_left = case[1]
          unclosed = case[2]
          max_n = max(max_n, pairs_left)
          max_unclosed = max(max_unclosed, unclosed)
          if s == "":   # 初始状态
            tmp.append(('(', pairs_left - 1, 1))
          elif s[-1] == ')':  # s末尾是')'
            if pairs_left > 0:
              tmp.append((s + '(', pairs_left - 1, unclosed + 1))
              if unclosed > 0:
                tmp.append((s + ')', pairs_left, unclosed - 1))
            else:
              if unclosed > 0:
                tmp.append((s + ')', pairs_left, unclosed - 1))
              else:
                tmp.append((s, pairs_left, unclosed))
          else:               # s末尾是'('
            if pairs_left > 0:
              tmp.append((s + '(', pairs_left - 1, unclosed + 1))
              if unclosed > 0:
                tmp.append((s + ')', pairs_left, unclosed - 1))
            else:
              if unclosed > 0:
                tmp.append((s + ')', pairs_left, unclosed - 1))
              else:
                tmp.append((s, pairs_left, unclosed))
        ans = tmp
      return [a[0] for a in ans]
            

