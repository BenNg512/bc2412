import java.util.HashMap;

class Testing {
    
    public static void main(String[] args) {
        // Input: nums = [4,1,2,1,2]
        // Output: 4

        int[] nums = {4,1,2,1,2,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); 
        }

        for (int i = 0; i < nums.length; i++){
            if (map.get(nums[i]) == 1){
                System.out.println(nums[i]);
            }
        }


    }
    
}
