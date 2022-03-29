 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1: return s
        self.bag = [[''] * len(s) for _ in range(numRows)]
        self.x, self.y, self.index = 0, 0, 0

        def forward():
            print(self.x, self.y)
            self.bag[self.x][self.y] = s[self.index]
            self.index += 1
            self.x += 1
            if self.index < len(s):
                if self.x < numRows:
                    forward()
                else:
                    self.x -= 2
                    self.y += 1
                    backward()

        def backward():
            print(self.x, self.y)
            self.bag[self.x][self.y] = s[self.index]
            self.index += 1
            self.x -= 1
            self.y += 1
            if self.index < len(s):
                if self.x == -1:
                    self.x = 1
                    self.y -= 1
                    forward()
                else:
                    backward()


        forward()
        ss = ''
        for i in self.bag:
            # print(i)
            for j in i:
                if j: ss += j
        return ss

