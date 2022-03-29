class Solution:
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        head, tail = 0, len(height) - 1
        max_volume = 0
        while head < tail:
            container_height = min(height[head], height[tail])
            container_width = tail - head
            volume = container_height * container_width
            if volume > max_volume:
                max_volume = volume
            if height[head] < height[tail]:
                head += 1
            else:
                tail -= 1
        return max_volume

