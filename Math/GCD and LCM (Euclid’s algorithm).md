# Finding GCD and LCM Using Euclid’s Algorithm
The greatest common divisor (GCD) of two numbers _a_ and _b_ is the greatest number that divides evenly into both _a_ and _b_. The lowest common multiple (LCM) of two numbers _a_ and _b_ is the smallest number that can be divided evenly by _a_ and _b_. The GCD can be used to find the LCM of two numbers, which is why they are closely related.\
Euclid’s algorithm is an efficient way of determining the GCD of two numbers by iterating over the two numbers until a remainder of 0 is found.\
It begins by expressing the larger number in terms of the smaller number plus a remainder _r_, and then the smaller number is then expressed in terms of _r_ plus a remainder. This process is repeated until the number can be expressed without a remainder.
For example: Finding the GCD of 1314 and 1022.
1. Express 1314 in terms of 1022 plus a remainder.\
``` 1314 = 1022 x 1 + 292 ```
2. Since the remainder is not 0, now express 1022 in terms of the remainder, 292 plus another number.\
``` 1022 = 292 x 3 + 146 ```
3. Repeat this process until you reach a remainder of 0.\
``` 292 = 146 x 2 + 0 ```<br/>
Since 146 produced a remainder of 0, the GCD of 1314 and 1022 is 146.\
## Implementation (GCD)
This algorithm can be easily coded as a recursive method.
```java
//assume that a and b cannot both be 0
public int GCD(int a, int b)
{
   if (b==0) 
      return a;
   return GCD(b,a%b);
}
```
## Implementation (LCM)
Using the GCD of two numbers _a_ and _b_ found from Euclid’s algorithm we can find the LCM by dividing _ab_ by their GCD.
```java
public int LCM(int a, int b)
{
   return b*a/GCD(a,b);
}
```
