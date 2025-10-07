public class Supply {
    int vertical;

    public Supply(int vertical) {
        this.vertical = vertical;
    }

    public int getVertical() {
        return this.vertical;
    }

    public static <E extends Comparable> E findLargest(E[] arr) {
        E largerst = arr[0];

        for (E elem : arr)
            if (largerst.compareTo(elem) < 0)
                largerst = elem;

        return largerst;
    }

    static class Facade {
        int bat;
        int fix;

        Facade(int bat, int fix) {
            this.bat = bat;
            this.fix = fix;
        }

        int getBat() {
            return this.bat;
        }

        int getFix() {
            return this.fix;
        }

        @Override
        public String toString() {
            return "bat: " + bat + "\tfix: " + fix;
        }
    }

    protected class Claim {
        int cat;
        int awl;

        public Claim(int cat, int awl) {
            this.cat = cat;
            this.awl = awl;
        }

        int getCat() {
            return this.cat;
        }

        int getAwl() {
            return this.awl;
        }

        @Override
        public String toString() {
            return "cat: " + cat + "\tAWL: " + awl;
        }
    }
}