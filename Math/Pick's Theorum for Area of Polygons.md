# Pick's Theorem for Area of Polygons on a Square Lattice
Pick's Theorem is a useful method for determining the area of any polygon whose vertices are points on a square lattice, a regularly spaced array of points.\
To understand this formula, two definitions are needed:\
Boundary Points (_B_): the number of lattice points on the polygon (including vertices)\
Interior Points (_I_): the number of lattice points in the polygon’s interior region\
The area of this polygon is then given by:\
```Area = B/2 + I - 1```\
A more detailed explination and proof of Pick's Theorem can be found [here](http://jwilson.coe.uga.edu/EMAT6680Fa05/Schultz/6690/Pick/Pick_Main.htm).
## Implementation
```java
public double pickArea(int b, int i) {
   return b/2 + i - 1;
}
```
This method can be used to return the area of a polygon when given _b_, the number of lattice point on the polygon (including vertices) and _i_, the number of lattice point in the polygon’s interior region.