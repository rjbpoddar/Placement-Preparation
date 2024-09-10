public class Q11_LongestPalindrome{
   public static void main(String [] args){
	int [] arr = {121, 1331, 232, 54545, 6125};
	System.out.println("Longest Palindrome = "+Longest(arr)); 
	
   }
   static boolean isPalindrome(int n){
	int rev = 0;
	int temp = n;
      	while(n!=0){
          rev = rev*10+(n%10);
          n/=10;
        }
	return temp == rev;
   }
   static int Longest(int [] arr){
	int ans = -1;
	for(int i = 0; i<arr.length;i++){
	   if(isPalindrome(arr[i]) == true && arr[i] > ans){
		ans = arr[i];
	   }
	}
	return ans;
   }
}