 class Solution:
  def XXX(self, num: int) -> str:
    items = [
      (1000, 'M'),
      (900, 'CM'),
      (500, 'D'),
      (400, 'CD'),
      (100, 'C'),
      (90, 'XC'),
      (50, 'L'),
      (40, 'XL'),
      (10, 'X'),
      (9, 'IX'),
      (5, 'V'),
      (4, 'IV'),
      (1, 'I'),
    ]

    s = ''

    for d, r in items:
      if num >= d:
        s += r * (num // d)
        num = num % d

    return s

