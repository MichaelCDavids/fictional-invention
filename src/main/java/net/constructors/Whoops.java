package net.constructors;

public class Whoops {
}

class Oops{
    int i;
    public Oops(int x) { this.i = x; }
}
class Bloops extends Oops{
    int j;
    Bloops(int z ) { this(z, z); }



    public Bloops(int x, int y) { super(x);  this.j = y; }
}
