public class palindromeNumber{
    public boolean isPalindrome(int x) {
        int duplicate = x;
        int check =0;
        while(duplicate>0){
            int last = duplicate%10;
            check = check*10+last;
            duplicate=duplicate/10;
        }
        if(check==x){
            return true;
        }
        else{
            return false;
        }
    }
}