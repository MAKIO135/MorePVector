MorePVector
===========

A Processing 2.0 library that implements PVector handling methods.

Depending on the renderer specified in the size(), the library will choose automatically between 2D/3D methods for the methods that can have both 2D/3D coordinates (like line(x1,y1, x2,y2) with a 2D renderer and line(x1,y1,z1, x2,y2,z2) with a 3D renderer). Since triangle() and quad() method are only 2D primitives in Processing, the library provides triangle3D() and quad3D() methods.

**PRIMITIVES**
void arc(PVector a, float w, float h, float start, float stop)
void arc(PVector a, float w, float h, float start, float stop, int mode)
void ellipse(PVector a, float w, float h)
void line(PVector a, PVector b)
void point(PVector a)
void quad(PVector a, PVector b, PVector c, PVector d)
-> void quad3D(PVector a, PVector b, PVector c, PVector d)
void rect(PVector a, float w, float h)
void rect(PVector a, float w, float h, float r) 
void rect(PVector a, float w, float h, float tl, float tr, float br, float bl)
void triangle(PVector a, PVector b, PVector c)
-> void triangle3D(PVector a, PVector b, PVector c)

**CURVES**
void bezier(PVector a, PVector b, PVector c, PVector d)
void curve(PVector a, PVector b, PVector c, PVector d)

**VERTEX**
void vertex(PVector a)
void quadraticVertex(PVector a, PVector b)

**TRANSFORMATIONS**
void translate(PVector a)
void scale(PVector a)