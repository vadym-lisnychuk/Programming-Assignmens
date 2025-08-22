
public class Providate implements Express {

    @Override
    public int swarm(String notice) {
        int count = 0;
        for (int idx = 0; idx < notice.length(); idx++) {
            if (notice.charAt(idx) == 'e') {
                count++;
            }
        }

        return count;
    }

    @Override
    public double follow(String vision, String volume) {
        return (vision.length() + volume.length()) / 2.0;
    }

    @Override
    public String cabin(String poll, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += poll;
        }

        return s;
    }

    @Override
    public int[] tone(int n) {
        int[] arr = new int[n + 1];

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = idx;
        }
        return arr;
    }

    @Override
    public double[] brink(int n, double k) {
        double[] arr = new double[n];

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = k;

        }
        return arr;
    }
}
