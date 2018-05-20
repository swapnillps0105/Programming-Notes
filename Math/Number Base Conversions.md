# Number Base Conversions
Number bases are different ways of writing and using the same number. We the standard(decimal) base for our arithmetic, but there are almost as many number bases as there are numbers, and it is important to know how to convert between them.\
In base 10, the "value" of each consequent digit increases by a factor of 10 as moving from right to left starting at 10^0. For example, the decimal number 4325. 4325 stands for 5 x 1 + 2 x 10 + 3 x 10 x 10 + 4 x 10 x 10 x 10. \
Binary numbers (base 2) work the same way, as each consequent digit increases by a factor of 2 as moving from right to left starting at 2^0.\
To convert from a decimal to a binary begins by dividing the number _n_ by 2 and memorize the remainder, and now repeat this process using the remainder as the new number _n_. The final list of remainders is the required binary representation.\
Example: Convert the decimal number 43 to binary (base 2)
```
43/2 = 21 + remainder 1
21/2 = 10 + remainder 1
10/2 = 5  + remainder 0
5/2  = 2  + remainder 1
2/2  = 1  + remainder 0
1/2  = 0  + remainder 1
```  
So 43 in decimal is 101011 in binary. This method can be used to create a function to convert a decimal number to another base.

## Implementation
To convert a number _n_ in base _b_ to a decimal number in Java:
```java
public int toDecimal(int n, int b) {
   return Integer.parseInt(""+n,b);
}
```
To convert from a decimal number _n_ to another base _b_(2<=b<=10):
```java
public int fromDecimal(int n, int b) {
   int result=0;
   int multiplier=1;
   while(n>0) {
      result+=n%b*multiplier;
      multiplier*=10;
      n=n/b;
   }
   return result;
}
```
If the base b is above 10 then we must use non-numeric characters to represent digits that have a value of 10 and more. We can let ‘A’ stand for 10, ‘B’ stand for 11 and so on. The following code will convert from a decimal to any base (up to base 20):
```java
public String fromDecimal2(int n, int b) {
   String chars="0123456789ABCDEFGHIJ";
   String result="";
   while(n>0) {
      result=chars.charAt(n%b) + result;
      n/=b;
   }
   return result;
}
```
In Java there are some useful shortcuts when converting from a decimal (base 10) number _n_ to other common representations, such as binary (base 2), octal (base 8) and hexadecimal (base 16):
```java
Integer.toBinaryString(n);
Integer.toOctalString(n);
Integer.toHexString(n);
```