public class Ex3d {

    // return this digit if it is single digit , otherwise
    // return the sum of the two digit
    public static int getDigit(int number){
    if(number < 9)
    return number;
    return number/10 + number%10;
    }


    // return the number of dogit in d
    public static int getSize(long d){
    String str = d + "";
    return str.length();
    }
    public static long getPrefix(long number , int k){
    if(getSize(number) > k) {
    String str = number + "";
    return Long.parseLong(str.substring(0, k));
    }
    return number;
    }

     // return true if the digit d is a prefix for number
 public static boolean prefixMatched(long number , int d){
    return getPrefix(number, getSize(d)) == d;
    }


    // sum of all digit in number
    public static int sumOfDoubleEvenPlace(long number){
    int sum =0;
    String str = number + "";
    for (int i = getSize(number) - 2; i >= 0; i -= 2){
    sum += getDigit(Integer.parseInt(str.charAt(i) + "") * 2);
    }
    return sum;
    }


    // return sum of odd place digit
    public static int sumOfOddPlace(long number){
    int sum = 0;
    String str = number + "";
    for (int i = getSize(number) - 1; i >= 0; i -= 2)
    sum += Integer.parseInt(str.charAt(i) + "");
    return sum;
}

// return true if number is valid
public static boolean is_valid(long number){
return (getSize(number) >= 13 && getSize(number)<=16) &&
(prefixMatched(number, 4) || prefixMatched(number, 5) ||
prefixMatched(number, 37) || prefixMatched(number, 6)) &&
((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10 == 0);
}

public static void main(String[] args) {
long number = 4388576018410707L;
System.out.println(number + " is " +(is_valid(number) ? "valid" :
"invalid"));
}
}
