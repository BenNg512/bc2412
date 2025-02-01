class Testing {
    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            if (target <= nums[i]){
                result = i;
                break;
            } else if (target > nums[nums.length - 1]){
                result = nums.length;
            }
        }return result;
        
    }
    
        public static void main(String[] args) {
            int[] arr = new int[]{1,2,3,3,4,3,3,4};
            System.out.println(searchInsert(arr, 7));
    }

}
