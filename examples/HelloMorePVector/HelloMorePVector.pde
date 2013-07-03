import makio135.morepvector.*;

MorePVector mp;
PVector v1 = new PVector(10, 10, 10);
PVector v2 = new PVector(170, 180, 30);
PVector v3 = new PVector(50, 120, -10);

void setup() {
	size(200,200,JAVA2D);
	// size(200,200,OPENGL);
	mp = new MorePVector(this);
}

void draw(){
	mp.rect(v1,100,100);
	
	mp.line(v1, PVector.add(v2,v3));

	pushMatrix();
	mp.translate(v1);
	mp.triangle(v1,v2,v3);
	popMatrix();
	noLoop();
}
