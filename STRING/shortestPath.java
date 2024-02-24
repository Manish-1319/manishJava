public class shortestPath {
    public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //EAST
            if(dir == 'E'){
                x++;
            }
            //WEST
            else if(dir == 'W'){
                x--;
            }
            //NORTH
            else if(dir == 'N'){
                y++;
            }
            //SOUTH
            else{
                y--;
            }
        }

        return (float)Math.sqrt(x*x + y*y);     //Since initial point (0,0)
    }

    public static void main(String[] args){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
