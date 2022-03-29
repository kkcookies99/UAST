 def XXX(self, s: str) -> bool:
    import re
    rg = re.compile(r'\d+|[a-zA-Z]+')
    re_list = rg.findall(s)
    re_str = ''.join(re_list).lower()
    return re_str == re_str[::-1]
