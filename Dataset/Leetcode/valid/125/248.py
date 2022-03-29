 class Solution:
    def XXX(self, s: str) -> bool:
        # sgood = "".join(ch.lower() for ch in s if ch.isalnum())
        # return sgood == sgood[::-1]

        st = "".join(i.lower() for i in s if i.isalnum())
        if st[:] == st[::-1]:
            print("str is huiwenshu")
        return st[:] == st[::-1]

