 class Solution:
    ROMAN = dict((
        ('M', 1000),
        ('CM', 900),
        ('D', 500),
        ('CD', 400),
        ('C', 100),
        ('XC', 90),
        ('L', 50),
        ('XL', 40),
        ('X', 10),
        ('IX', 9),
        ('V', 5),
        ('IV', 4),
        ('I', 1),
    ))

    def __init__(self):
        self.tokens = []
        self.frag = ''
        self.state = 'START'
        self.table = {
            'IN_C': ['M', 'D'],
            'IN_X': ['L', 'C'],
            'IN_I': ['X', 'V']
        }

    def get(self, ch):
        if self.frag:
            self.tokens.append(self.frag)
            self.frag = ''

        if ch in ['C', 'X', 'I']:
            self.frag = ch
            self.state = 'IN_%s' % ch
        else:
            self.frag = ch
            self.state = 'START'

    def XXX(self, s: str) -> int:
        for ch in s:
            if self.state == 'START':
                self.get(ch)
            elif self.state in self.table:
                if ch in self.table[self.state]:
                    self.frag += ch
                    self.state = 'START'
                else:
                    self.get(ch)

        self.get('')

        ans = 0
        for token in self.tokens:
            ans += self.ROMAN[token]

        return ans


if __name__ == '__main__':
    print(Solution().XXX('MCMXCIV'))


