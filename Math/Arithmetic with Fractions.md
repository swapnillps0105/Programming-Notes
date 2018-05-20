# Arithmetic with Fractions
For most purposes it is sufficient to represent fractions as 2-element arrays (pairs). The numerator is stored in the first element and the denominator in the second element.\
Using this method along with the GCD and LCM, you can create functions to multiply, add, and subtract fractions.\
(The GCD and LCM function can be found [here](https://github.com/danielzyy/Programming-Notes/blob/master/Math/GCD%20and%20LCM%20%28Euclid%E2%80%99s%20algorithm%29.md))
## Implementation
When multiplying fractions _a_ and _b_, you simply multiply the numerator and denominator to get the resulting fraction _c_.
```java
public int[] multiplyFractions(int[] a, int[] b)
{
   int[] c={a[0]*b[0], a[1]*b[1]};
   return c;
}
```
When adding fractions, first find the LCM of the denominators of the two fractions, then multiply the numerators accordingly and add them together to get the resulting numerator. The final denominator will be the LCM of two numbers. Subtraction uses the same method. 
```java
public int[] addFractions(int[] a, int[] b)
{
   int denom=LCM(a[1],b[1]);
   int[] c={denom/a[1]*a[0] + denom/b[1]*b[0], denom};
   return c;
}
```
It is useful to know how to reduce a fraction to its simplest form. The simplest form of a fraction occurs when the GCD of the numerator and denominator is equal to 1. The method below will find the GCD of the numerator and denominator, and divide both the numerator and denominator by the GCD to return the fraction in simplest form.
```java
public int[] reduceFraction(int[] a)
{
   int b=GCD(a[0],a[1]);
   a[0]/=b;
   a[1]/=b;
   return a;
}
```
