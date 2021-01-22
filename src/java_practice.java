public class java_practice {
    public static void main(String args[]) {
        char[] s = {'H','e','l','l','o'};
        int left = 0, right = s.length-1;
        while(left < right){
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp ;
        }
        System.out.println(s);
    }


    public int singleNumber(int[] nums) {
        List<Integer> my_list = new ArrayList<>();

        for(int i : nums){
            if(!my_list.contains(i)){
                my_list.add(i);
            }else{
                my_list.remove(new Integer(i));
            }
        }

        return my_list.get(0);
    }


        public int[] runningSum(int[] nums) {
            int[] result = nums;
            int temp = 0;

            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i] + temp;
                temp = nums[i];


            }


            return result;
        }



    class Solution {
        public int[] runningSum(int[] nums) {
            for(int i=1; i<nums.length; i++){
                nums[i] = nums[i-1]+nums[i];
            }

            return nums;
        }
    }



    class Solution {
        public ListNode reverseList(ListNode head) {

            ListNode pre = null;
            ListNode cur = head;

            while (cur != null){
                ListNode nextTemp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nextTemp;
            }
            return pre;
        }
    }

    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length()!= t.length()){
                return false;
            }

            char[] str1 = s.toCharArray();
            char[] str2 = t.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            return Arrays.equals(str1, str2);
        }
    }


}



