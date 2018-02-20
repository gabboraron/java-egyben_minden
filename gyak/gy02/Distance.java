class Distance {
    public static void main(String[] args) {
        double distance = 0.0;
        
        for(int i = 0; i < args.length; i=i+2) {
            if (i<=args.length-4) {

            Point p1 = new Point();
            p1.x = Integer.parseInt(args[i]);
            p1.y = Integer.parseInt(args[i+1]);
            
            /*System.out.println(i);
            System.out.println(args[i]);
            System.out.println(args[i+1]);
            System.out.println(args[i+2]);
            System.out.println(args[i+3]);
            System.out.println("****");*/

            Point p2 = new Point();
            p2.x = Integer.parseInt(args[i+2]);
            p2.y = Integer.parseInt(args[i+3]);
            
            distance += Point.getDistance(p1,p2);
            }
        }
        
        System.out.println(distance);
    }
}