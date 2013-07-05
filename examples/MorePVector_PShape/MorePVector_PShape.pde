import makio135.morepvector.*;

MorePVector mp;
PVector[] v;
PShape s;

void setup() {
	size(200,200,OPENGL);

	mp = new MorePVector(this);

	v = new PVector[5];
	for(int i = 0; i<5; i++){
		float x = width/2 + cos(TWO_PI/5.*i)*random(width/2);
		float y = height/2 + sin(TWO_PI/5.*i)*random(height/2);
		float z = random(-100,100);
		v[i] = new PVector(x,y,z);
	}

	s = createShape();
	s.beginShape();
	for(int i = 0; i<5; i++){
		mp.vertex(s, v[i]);//instead of s.vertex(v[i].x,v[i].y,v[i].z)
	}
	s.endShape(CLOSE);
}

void draw(){
	shape(s,0,0);
	noLoop();
}