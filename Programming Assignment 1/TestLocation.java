class TestLocation{

    public static void main(String[] args){
        Location point1 = new Location("A", 15.15, 15.5);
        Location point2 = new Location("B");

        Location[] Points = {point1, point2};

        for (int i = 0; i < Points.length; i++) {
            System.out.println(Points[i].toString());
        }
    }
}