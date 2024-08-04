import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i;

      for(i=0;i<n;i++)
      {
        nums1[m]=nums2[i];
        m++;
      } Arrays.sort(nums1);  
    }
}