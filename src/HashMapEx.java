import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
//        fun();
//        hfc();
//        gce();
    }

    private static void gce() {
        int[] a1 = {1, 1, 2, 2, 2, 3, 5,};
        int[] a2 = {1, 1, 1, 2, 2, 4, 5};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (Integer val : a1) {
            if (hm.containsKey(val)) {
                int of = hm.get(val);
                int nf = of + 1;
                hm.put(val, nf);
            } else {
                hm.put(val, 1);
            }
        }

        for (Integer val : a2) {
            if (hm.containsKey(val) && hm.get(val) > 0) {
                System.out.print(" " + val);
                int of = hm.get(val);
                int nf = of - 1;

                hm.put(val, nf);
            }
        }

//        System.out.print(hm.values());
    }

    private static void hfc() {
        String str = "aabacdcaadbad";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                int of = hm.get(ch);
                int nf = of + 1;
                hm.put(ch, nf);
            } else {
                hm.put(ch, 1);
            }


        }
        char mfc = str.charAt(0);

        for (Character key : hm.keySet()) {
            if (hm.get(key) > hm.get(mfc)) {
                mfc = key;
            }

        }
        System.out.println(mfc + " : " + hm.get(mfc));

    }

    private static void fun() {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 130);
        hm.put("UK", 30);
        hm.put("US", 40);
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsValue(130));
        Set<String> keys = hm.keySet();
        System.out.println("Keys " + keys);
        for (String key : hm.keySet()) {
            Integer val = hm.get(key);
            System.out.println(val);
        }
    }
}
