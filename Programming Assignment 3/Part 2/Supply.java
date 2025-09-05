public class Supply {
    private int vertical;

    public Supply(int vertical) {
        this.vertical = vertical;
    }

    public int getVertical() {
        return vertical;
    }

    static class Facade {
        private int bat;
        private int fix;

        Facade(int bat, int fix) {
            this.bat = bat;
            this.fix = fix;
        }

        public int getBat() {
            return bat;
        }

        public int getFix() {
            return fix;
        }

        @Override
        public String toString() {
            return "Bat: " + bat + "\n" + "Fix: " + fix;
        }
    }

    class Claim {
        private int cat;
        private int awl;

        public Claim(int cat, int awl) {
            this.cat = cat;
            this.awl = awl;
        }

        public int getCat() {
            return cat;
        }

        public int getAwl() {
            return awl;
        }

        @Override
        public String toString() {
            return "Cat: " + cat + "\n" + "Awl: " + awl;
        }

        public static <E extends Comparable<E>> E findLargest(E[] arr){
            E largest = arr[0];

            for (E elem : arr) {
                if(elem.compareTo(largest) > 0)
                    largest = elem;
            }

            return largest;
        }
    }
}