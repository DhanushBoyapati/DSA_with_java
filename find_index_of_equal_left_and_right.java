class Solution {
    public int pivotIndex(int[] nums) {

        int leftsum=0;
        int rightsum=0;
     
        for(int i=0;i<nums.length;i++)
        {
            rightsum+=nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        { 
            rightsum-=nums[i];
           
            if(leftsum==rightsum)
            {
                return i;
            }
            leftsum=leftsum+nums[i];
            
        }

        return -1;

        
    }
}



// ✅ Input:

// nums = [0, 5, 6, 1, 6, 5, 0]
// ✅ Step 1: Calculate total sum

// totalSum = 0 + 5 + 6 + 1 + 6 + 5 + 0 = 23
// ✅ Step 2: Initialize

// leftSum = 0
// ✅ Step 3: Iterate through each index
// Index 0 (value = 0)

// leftSum = 0
// rightSum = totalSum - leftSum - nums[0]
//           = 23 - 0 - 0
//           = 23
// leftSum != rightSum → not pivot
// Update leftSum = 0 + 0 = 0
// Index 1 (value = 5)

// leftSum = 0
// rightSum = 23 - 0 - 5 = 18
// not equal
// Update leftSum = 0 + 5 = 5
// Index 2 (value = 6)
// leftSum = 5
// rightSum = 23 - 5 - 6 = 12
// not equal
// Update leftSum = 5 + 6 = 11
// Index 3 (value = 1)

// leftSum = 11
// rightSum = 23 - 11 - 1 = 11
// ✅ leftSum == rightSum → pivot index = 3
// ✅ Result:
// Pivot index = 3 (element = 1)

// ✔ Explanation:

// Left of index 3: [0, 5, 6] → sum = 11

// Right of index 3: [6, 5, 0] → sum = 11

// Pivot element (1) is not included in either side.
