package Game;
// import java.lang.Math;
class Point

   {
        int x;
        int y;
        public int team;
        
        public Point(int x, int y)
        {   
            this.x = x;
            this.y = y;
        }

        public double range(Point pointA, Point pointB) 
        {
            return Math.sqrt(Math.pow((pointA.x - pointB.x),2) + Math.pow((pointA.y - pointB.y),2));
        }

        @Override
        public boolean equals(Object obj) 
        {
            Point t = (Point) obj;
            return this.x == t.x && this.y == t.y;
        }

    }   
