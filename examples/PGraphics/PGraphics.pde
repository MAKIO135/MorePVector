import makio135.morepvector.*;

MorePVector mp;
PGraphics pg;
PVector v = new PVector(20,20);

void setup() {
	size(100, 100);
	mp = new MorePVector(this);
	pg = createGraphics(40, 40);
}

void draw() {
	PVector m = new PVector(mouseX,mouseY);
	pg.beginDraw();
	pg.background(100);
	pg.stroke(255);
	mp.line(pg,v,m);//instead of pg.line(v.x,v.y,m.x,m.y);
	pg.endDraw();
	image(pg, 9, 30); 
	image(pg, 51, 30);
}