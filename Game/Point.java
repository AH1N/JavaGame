package Game;

public class Point

   {
        int x;
        int y;
        public int team;
        
        public Point(int x, int y)
        {   
            this.x = x;
            this.y = y;
        }

        public static double range(Point pointA, Point pointB) 
        {
            return Math.sqrt(Math.pow((pointA.x - pointB.x),2) + Math.pow((pointA.y - pointB.y),2));
        }
        
        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        @Override
        public boolean equals(Object obj) 
        {
            Point t = (Point) obj;
            return this.x == t.x && this.y == t.y;
        }

        public void moveR() 
        {
            this.x++;
        }
        public void moveL() 
        {
            this.x--;
        }
    }   
