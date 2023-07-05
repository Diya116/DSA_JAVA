class first_last_pos_sorted_array{ 
   public int[] searchRange(int[] nums, int target) {
        int[] a={-1,-1};
       a[0]=searchvalue(nums,target,true);
       a[1]=searchvalue(nums,target,false);

        return a;
    }
    public int searchvalue(int[] nums,int target,boolean isstart)
    {
        int start=0;
        int end=nums.length-1;
        int val=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if (target> nums[mid])
             {
                   start=mid+1;
             }
             else if( target< nums[mid]){
                  end=mid-1;
             }
             else{
                 val=mid;
                if(isstart)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

             }
        }
        return val;
    }
    
}