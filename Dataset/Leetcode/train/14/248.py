 def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        str_min = min([len(i) for i in strs])
        tar_str = strs[0][:str_min]
        for j in range(str_min):
            if all([x.startswith(tar_str) for x in strs]):
                return tar_str
            else:
                tar_str = tar_str[:len(tar_str)-1]
        return ""

