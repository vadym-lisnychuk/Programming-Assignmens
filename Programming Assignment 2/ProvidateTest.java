
import java.util.Arrays;

public class ProvidateTest {

    public static void main(String[] args) {
        Providate o = new Providate();

        System.out.println("Swarm:\t" + o.swarm("elucidate"));
        System.out.println("Follow:\t" + o.follow("bed", "slug"));
        System.out.println("Cabin:\t" + o.cabin("la", 10));
        System.out.println("Tone:\t" + Arrays.toString(o.tone(9)));
    }
}
