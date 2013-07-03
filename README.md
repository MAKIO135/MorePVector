MorePVector
===========

A Processing 2.0 library that implements PVector handling methods.

Depending on the renderer specified in the size(), the library will choose automatically between 2D/3D methods for the methods that can have both 2D/3D coordinates (like line(x1,y1, x2,y2) with a 2D renderer and line(x1,y1,z1, x2,y2,z2) with a 3D renderer).<br/>
Since triangle() and quad() method are only 2D primitives in Processing, the library provides triangle3D() and quad3D() methods.

**PRIMITIVES**<br/>
void arc(PVector a, float w, float h, float start, float stop)<br/>
void arc(PVector a, float w, float h, float start, float stop, int mode)<br/>
void ellipse(PVector a, float w, float h)<br/>
void line(PVector a, PVector b)<br/>
void point(PVector a)<br/>
void quad(PVector a, PVector b, PVector c, PVector d)<br/>
-> void quad3D(PVector a, PVector b, PVector c, PVector d)<br/>
void rect(PVector a, float w, float h)<br/>
void rect(PVector a, float w, float h, float r) <br/>
void rect(PVector a, float w, float h, float tl, float tr, float br, float bl)<br/>
void triangle(PVector a, PVector b, PVector c)<br/>
-> void triangle3D(PVector a, PVector b, PVector c)

**CURVES**<br/>
void bezier(PVector a, PVector b, PVector c, PVector d)<br/>
void curve(PVector a, PVector b, PVector c, PVector d)

**VERTEX**<br/>
void vertex(PVector a)<br/>
void quadraticVertex(PVector a, PVector b)<br/>
<br/>
**TRANSFORMATIONS**<br/>
void translate(PVector a)<br/>
void scale(PVector a)