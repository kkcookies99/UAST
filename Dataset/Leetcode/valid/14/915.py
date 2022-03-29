 class Solution:
    def XXX(self, strs: List[str]) -> str:
        m_str = min(strs)
        l_m_str = len(m_str)
        if not m_str:
            return m_str
        for i in range(l_m_str):
            for j in strs:
                if m_str[i] != j[i]:
                    return  m_str[:i]
        return m_str

