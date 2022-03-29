class Solution:
    def XXX(self, a: str, b: str) -> str:
        _index_a = len(a) - 1
        _index_b = len(b) - 1

        _tmp = '0'  # 进位

        _result = ""
        while _index_a >= 0 or _index_b >= 0:
            _a = a[_index_a] if _index_a >= 0 else '-1'
            _b = b[_index_b] if _index_b >= 0 else '-1'

            if _a == _b == _tmp == '1':
                _result = '1' + _result
                _tmp = '1'
            elif (_a == '1' and _b == '1') or (_a == '1' and _tmp == '1') or (_b == '1' and _tmp == '1'):
                _result = '0' + _result
                _tmp = '1'
            elif _a == '1' or _b == '1' or _tmp == '1':
                _result = '1' + _result
                _tmp = '0'
            else:
                _result = '0' + _result
                _tmp = '0'
            _index_b -= 1
            _index_a -= 1
        
        if _tmp == '1':
            return '1' + _result
        return _result

