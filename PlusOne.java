class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length==0){
            return digits;
        }
        int lastindex=digits.length-1;
        if (digits[lastindex]<9){
            digits[lastindex]++;
            return digits;
        }
        for (int i=lastindex;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int [] result=new int[digits.length+1];
        result[0]=1;
        return result;
    }
}
