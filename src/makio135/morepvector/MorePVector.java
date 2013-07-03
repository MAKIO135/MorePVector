/**
 * MorePVector
 * A Processing 2.0 library that implements PVector handling methods. Depending on the renderer specified in the size(), the library will choose automatically between 2D/3D methods for the methods that can have both 2D/3D coordinates (like line(x1,y1, x2,y2) with a 2D renderer and line(x1,y1,z1, x2,y2,z2) with a 3D renderer). Since triangle() and quad() method are only 2D primitives in Processing, the library provides triangle3D() and quad3D() methods.
 * http://github.com/MAKIO135/MorePVector/
 *
 * Copyright (C) 2013 Lionel Radisson / Makio135 http://makio135.com
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author	  Lionel Radisson / Makio135 http://makio135.com
 * @modified	07/03/2013
 * @version	 0.1.5 (1)
 */

package makio135.morepvector;



import processing.core.*;

/**
 * Little wrappers for Processing
 * Let you work directly with Pvector
 * 
 * @example Hello 
 */

public class MorePVector {
	
	// pa is a reference to the parent sketch
	private PApplet pa;
	private boolean flat;
	
	public final static String VERSION = "0.1.5";
	

	/**
	 * Constructor, usually called in the setup() method in your sketch to
	 * initialize and start the library.
	 * 
	 * @example Hello
	 * @param parent
	 *		reference to the parent sketch
	 */
	public MorePVector(PApplet parent) {
		pa = parent;
		checkRenderer();
		welcome();
	}
	
	private void checkRenderer(){
		//JAVA2D:	processing.core.PGraphicsJava2D
		//P2D :		processing.opengl.PGraphics2D
		//P3D :		processing.opengl.PGraphics3D
		//OPENGL:	processing.opengl.PGraphics3D
		String rendererType = pa.g.getClass().getName();
		flat = !rendererType.equals("processing.opengl.PGraphics3D");
		// PApplet.println("flat: "+flat);
	}

	private void welcome() {
		System.out.println("MorePVector v0.1.5");
	}
	
	/**
	 * return the version of the library.
	 * 
	 * @return String
	 */
	public static String version() {
		return VERSION;
	}
	

	/* PRIMITIVES */

	/**
	 * @param a
	 *		PVector: coordinates of the arc's ellipse
	 * @param w
	 *		float: width of the arc's ellipse by default
	 * @param h
	 *		float: height of the arc's ellipse by default
	 * @param start
	 *		float: angle to start the arc, specified in radians
	 * @param stop
	 *		float: angle to stop the arc, specified in radians
	 */
	public void arc(PVector a, float w, float h, float start, float stop) {
		pa.arc(a.x, a.y, w, h, start, stop);
	}

	/**
	 * @param a
	 *		PVector: coordinates of the arc's ellipse
	 * @param w
	 *		float: width of the arc's ellipse by default
	 * @param h
	 *		float: height of the arc's ellipse by default
	 * @param start
	 *		float: angle to start the arc, specified in radians
	 * @param stop
	 *		float: angle to stop the arc, specified in radians
	 * @param mode
	 *		int: default mode is OPEN, and the other options are CHORD and PIE
	 */
	public void arc(PVector a, float w, float h, float start, float stop, int mode) {
		pa.arc(a.x, a.y, w, h, start, stop, mode);
	}

	/**
	 * @param a
	 * 		PVector: coordinates of the ellipse
	 * @param w
	 * 		float: width of the ellipse
	 * @param h
	 * 		float: height of the ellipse
	 */
	public void ellipse(PVector a, float w, float h) {
		pa.ellipse(a.x, a.y, w, h);
	}

	/**
	 * @param a
	 * 		PVector: coordinates of the first point
	 * @param b
	 *	 PVector: coordinates of the second point
	 */
	public void line(PVector a, PVector b) {
		if (flat) {
			pa.line(a.x, a.y, b.x, b.y);
		}
		else {
			pa.line(a.x, a.y, a.z, b.x, b.y, b.z);
		}
	}

	/**
	 * @param a
	 * 		PVector: coordinates of the point
	 */
	public void point(PVector a) {
		if (flat) {
			pa.point(a.x, a.y);
		}
		else {
			pa.point(a.x, a.y, a.z);
		}
	}

	/**
	 * @param a
	 *		PVector: coordinates of the first corner
	 * @param b
	 *		PVector: coordinates of the second corner
	 * @param c
	 *		PVector: coordinates of the third corner
	 * @param d
	 *		PVector: coordinates of the fourth corner
	 */
	public void quad(PVector a, PVector b, PVector c, PVector d) {
		pa.quad(a.x, a.y, b.x, b.y, c.x, c.y, d.x, d.y);
	}

	/**
	 * @param a
	 *		PVector: coordinates of the first corner
	 * @param b
	 *		PVector: coordinates of the second corner
	 * @param c
	 *		PVector: coordinates of the third corner
	 * @param d
	 *		PVector: coordinates of the fourth corner
	 */
	public void quad3D(PVector a, PVector b, PVector c, PVector d) {
		if (flat) {
			PApplet.println("MorePVector.quad3D() can NOT be used within a 2D renderer");
		}
		else {
			pa.beginShape();
			vertex(a);
			vertex(b);
			vertex(c);
			vertex(d);
			pa.endShape(PApplet.CLOSE);
		}
	}

	/**
	 * @param a
	 *		PVector: coordinates of the first corner
	 * @param w
	 * 		float: width of the rect
	 * @param h
	 * 		float: height of the rect
	 */
	public void rect(PVector a, float w, float h) {
		pa.rect(a.x, a.y, w, h);
	}

	/**
	 * @param a
	 *		PVector: coordinates of the first corner
	 * @param w
	 * 		float: width of the rect
	 * @param h
	 * 		float: height of the rect
	 * @param r
	 *		float: radii for all four corners
	 */
	public void rect(PVector a, float w, float h, float r) {
		pa.rect(a.x, a.y, w, h, r);
	}

	/**
	 * @param a
	 *		PVector: coordinates of the first corner
	 * @param w
	 * 		float: width of the rect
	 * @param h
	 * 		float: height of the rect
	 * @param tl
	 *		float: radius for top-left corner
	 * @param tr
	 *		float: radius for top-right corner
	 * @param br
	 *		float: radius for bottom-right corner
	 * @param bl
	 *		float: radius for bottom-left corner
	 */
	public void rect(PVector a, float w, float h, float tl, float tr, float br, float bl) {
		pa.rect(a.x, a.y, w, h, tl, tr, br, bl);
	}

	/**
	 * @param a
	 *		PVector: coordinates of the first point
	 * @param b
	 *		PVector: coordinates of the second corner
	 * @param c
	 *		PVector: coordinates of the third corner
	 */
	public void triangle(PVector a, PVector b, PVector c) {
		pa.triangle(a.x, a.y, b.x, b.y, c.x, c.y);
	}

	/**
	 * @param a
	 *		PVector: coordinates of the first corner
	 * @param b
	 *		PVector: coordinates of the second corner
	 * @param c
	 *		PVector: coordinates of the third corner
	 */
	public void triangle3D(PVector a, PVector b, PVector c) {
		if (flat) {
			PApplet.println("MorePVector.triangle3D() can NOT be used within a 2D renderer");
		}
		else {
			pa.beginShape();
			vertex(a);
			vertex(b);
			vertex(c);
			pa.endShape(PApplet.CLOSE);
		}
	}


	/* CURVES */

	/**
	 * @param a
	 *		PVector: coordinates of the first anchor  point
	 * @param b
	 *		PVector: coordinates of the first control point
	 * @param c
	 *		PVector: coordinates of the second control point
	 * @param d
	 *		PVector: coordinates of the second anchor point
	 */
	public void bezier(PVector a, PVector b, PVector c, PVector d) {
		if(flat){
			pa.bezier(a.x, a.y, b.x, b.y, c.x, c.y, d.x, d.y);
		}
		else{
			pa.bezier(a.x, a.y, a.z, b.x, b.y, b.z, c.x, c.y, c.z, d.x, d.y, d.z);
		}
	}

	/**
	 * @param a
	 *		PVector: coordinates of the beginning control point
	 * @param b
	 *		PVector: coordinates of the first point
	 * @param c
	 *		PVector: coordinates of the second point
	 * @param d
	 *		PVector: coordinates of the ending control point
	 */
	public void curve(PVector a, PVector b, PVector c, PVector d) {
		if(flat){
			pa.curve(a.x, a.y, b.x, b.y, c.x, c.y, d.x, d.y);
		}
		else{
			pa.curve(a.x, a.y, a.z, b.x, b.y, b.z, c.x, c.y, c.z, d.x, d.y, d.z);
		}
	}


	/* VERTEX */

	/**
	 * @param a
	 *		PVector: coordinates of the point
	 */
	public void vertex(PVector a) {
		if(flat){
			pa.vertex(a.x, a.y);
		}
		else{
			pa.vertex(a.x, a.y, a.z);
		}
	}

	/**
	 * @param a
	 *		PVector: coordinates of the control point
	 * @param b
	 *		PVector: coordinates of the anchor point
	 */
	public void quadraticVertex(PVector a, PVector b) {
		if(flat){
			pa.quadraticVertex(a.x, a.y, b.x, b.y);
		}
		else{
			pa.quadraticVertex(a.x, a.y, a.z, b.x, b.y, b.z);
		}
	}
	
	
	/* TRANSFORMATIONS */
	
	/**
	 * @param a
	 * 		PVector: coordinates of the point
	 */
	public void translate(PVector a) {
		if (flat) {
			pa.translate(a.x, a.y);
		}
		else {
			pa.translate(a.x, a.y, a.z);
		}
	}
	
	/**
	 * @param a
	 * 		PVector: coordinates of the point
	 */
	public void scale(PVector a) {
		if (flat) {
			pa.scale(a.x, a.y);
		}
		else {
			pa.scale(a.x, a.y, a.z);
		}
	}
	
	
}