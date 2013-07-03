import makio135.morepvector.*;

MorePVector mp;
PVector v1 = new PVector(10, 10, 10);
PVector v2 = new PVector(190, 190, 190);

void setup() {
	size(200,200,JAVA2D);
	mp = new MorePVector(this);
}

void draw(){
	mp.rect(v1,100,100);
	mp.line(v1,v2);
	noLoop();
}