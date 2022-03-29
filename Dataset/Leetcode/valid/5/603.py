 class Solution:
    def XXX(self, s: str) -> str:
      lens = len(s)

      ans = ''

      for i in range(lens):
        if lens <= len(ans) + i:
          break

        k = lens - 1
        head, foot = i, k
        longest = foot - head
        while head < foot:
          if s[head] != s[foot]:
            head = i
            foot = k - 1
            longest = foot - head
            k = foot
          else:
            head += 1
            foot -= 1

        ans = s[i:k + 1] if max(len(ans), longest) == longest else ans

      return ans

