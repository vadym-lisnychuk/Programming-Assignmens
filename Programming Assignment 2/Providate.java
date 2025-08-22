
public class Providate implements Express {

    public int swarm(String notice) {
        int count = 0;
        for (int idx = 0; idx < notice.length(); idx++) {
            if (notice.charAt(idx) == 'e') {
                count++;
            }
        }

        return count;
    }

    public double follow(String vision, String volume) {
        return (vision.length() + volume.length()) / 2.0;
    }

    public String cabin(String poll, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += poll;
        }

        return s;
    }

    public int[] tone(int n) {
        int[] arr = new int[n + 1];

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = idx;
        }
        return arr;
    }

    public double[] brink(int n, double k) {

        return ;
    }
}
