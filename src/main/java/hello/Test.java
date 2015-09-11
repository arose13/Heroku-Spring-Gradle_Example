package hello;

import java.util.ArrayList;

/**
 * Created by Anthony on 9/10/2015.
 * Spring hello world class
 */
public class Test {

    private final long id;
    private final String content;
    private final ArrayList<Integer> boobs;

    public Test(long id, String content) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 250; i++) {
            a.add(i+1);
        }
        this.id = id;
        this.content = content;
        this.boobs = a;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public ArrayList<Integer> getBoobs() {
        return boobs;
    }
}
