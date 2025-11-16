package codes;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] nums2=nums.clone();

        for(int j=0;j<nums2.length;j++){
            nums[(j+k)%nums.length]=nums2[j];
        }
    }

}
