public class testSupply {
    public static void main(String[] args) {
        Supply mySupply = new Supply(5);

        String[] stringsArray = {"Hello", "World" };
        Integer[] intsArray = {1, 2, 3, 4, 5};
    
        System.out.println("Largest string:\t" + mySupply.findLargest(stringsArray));
        System.out.println("Largest integer: " + mySupply.findLargest(intsArray));

        Supply.Facade myFacade = new Supply.Facade(0, 1);
        Supply.Claim myClaim = mySupply.new Claim(2, 3);

        System.out.println(myFacade.toString());
        System.out.println(myClaim.toString());
    }
}