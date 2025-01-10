import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums1.length==0 || nums2.length==0 || k==0) {
            return ans;
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0] + a[1]));
        for (int i = 0; i < Math.min(k, nums1.length); i++) {
        minHeap.offer(new int[]{nums1[i], nums2[0], 0});         }
        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int sum = current[0] + current[1];
            int i = current[0], j = current[1], indexInNums2 = current[2];
            ans.add(Arrays.asList(i, j));
            if (indexInNums2 + 1 < nums2.length) {
                minHeap.offer(new int[]{i, nums2[indexInNums2 + 1], indexInNums2 + 1});
            }
        }
        return ans;
    }
}
