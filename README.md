MorePVector
===========

A Processing 2.0.1 library that implements PVector handling methods. <br>
Library page: http://makio135.github.io/morepvector/ <br>
Reference: http://makio135.github.io/morepvector/reference/index.html

Depending on the renderer specified in the size(), the library will choose automatically between 2D/3D methods for the methods that can have both 2D/3D coordinates (like line(x1,y1, x2,y2) with a 2D renderer and line(x1,y1,z1, x2,y2,z2) with a 3D renderer).

Since triangle() and quad() method are only 2D primitives in Processing, the library provides triangle3D() and quad3D() methods.

**PApplet**
* Primitives
	* void arc(PVector a, float w, float h, float start, float stop)
	* void arc(PVector a, float w, float h, float start, float stop, int mode)
	* void ellipse(PVector a, float w, float h)
	* void line(PVector a, PVector b)
	* void point(PVector a)
	* void quad(PVector a, PVector b, PVector c, PVector d)
	* => void quad3D(PVector a, PVector b, PVector c, PVector d)
	* void rect(PVector a, float w, float h)
	* void rect(PVector a, float w, float h, float r) 
	* void rect(PVector a, float w, float h, float tl, float tr, float br, float bl)
	* void triangle(PVector a, PVector b, PVector c)
	* => void triangle3D(PVector a, PVector b, PVector c)
* Curves
	* void bezier(PVector a, PVector b, PVector c, PVector d)
	* void curve(PVector a, PVector b, PVector c, PVector d)
* Vertex
	* void bezierVertex(PVector a, PVector b, PVector c)
	* void curveVertex(PVector a)
	* void vertex(PVector a)
	* void quadraticVertex(PVector a, PVector b)
* Transformations
	* void translate(PVector a)
	* void scale(PVector a)

The library also provides methods for PGraphics and PShape classes.
When working on a PShape or a PGragphics you need to pass the object in the function: pg.line(x1,y1,x2,y2) => line(pg,v1,v2);

**PGraphics**
* Primitives
	* void arc(PGraphics pg, PVector a, float w, float h, float start, float stop)
	* void arc(PGraphics pg, PVector a, float w, float h, float start, float stop, int mode)
	* void ellipse(PGraphics pg, PVector a, float w, float h)
	* void line(PGraphics pg, PVector a, PVector b)
	* void point(PGraphics pg, PVector a)
	* void quad(PGraphics pg, PVector a, PVector b, PVector c, PVector d)
	* ->void quad3D(PGraphics pg, PVector a, PVector b, PVector c, PVector d)
	* void rect(PGraphics pg, PVector a, float w, float h)
	* void rect(PGraphics pg, PVector a, float w, float h, float r)
	* void rect(PGraphics pg, PVector a, float w, float h, float tl, float tr, float br, float bl)
	* void triangle(PGraphics pg, PVector a, PVector b, PVector c)
	* ->void triangle3D(PGraphics pg, PVector a, PVector b, PVector c)
* Curves
	* void bezier(PGraphics pg, PVector a, PVector b, PVector c, PVector d)
	* void curve(PGraphics pg, PVector a, PVector b, PVector c, PVector d)
* Vertex
	* void bezierVertex(PGraphics pg, PVector a, PVector b, PVector c)
	* void curveVertex(PGraphics pg, PVector a)
	* void vertex(PGraphics pg, PVector a)
	* void quadraticVertex(PGraphics pg, PVector a, PVector b)
* Transformations
	* void translate(PGraphics pg, PVector a)
	* void scale(PGraphics pg, PVector a)

**PShape**
* Vertex
	* void bezierVertex(PShape s, PVector a, PVector b, PVector c)
	* void curveVertex(PShape s, PVector a)
	* void vertex(PShape s, PVector a)
	* void quadraticVertex(PShape s, PVector a, PVector b)
* Transformations
	* void translate(PShape s, PVector a)
	* void scale(PShape s, PVector a)
