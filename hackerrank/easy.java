
Separate the numbers:

List<String> ls = new ArrayList<String>();
            for (int i = 1; i < (s.length() / 2) + 1; i++) { // only half 
                ls.add(s.substring(0, i));
            }
            // System.out.println(ls);

            for (String s1 : ls) {
                String ori = s1;
                StringBuilder sb = new StringBuilder();
                boolean found = true;
                int i = 0;
                while (sb.length() <= 32) {
                    if ((i + s1.length()) > s.length()) {
                        break;
                    }
                    // System.out.println(s.substring(i, i + s1.length()) + " " + s1);
                    if (!s.substring(i, i + s1.length()).equals(s1)) {
                        found = false;
                        break;
                    }
                    i += s1.length();
                    Long n = Long.parseLong(s1) + 1;
                    s1 = n.toString();
                }
                if (i != s.length()) {
                    found = false;
                }
                if (found) {
                    System.out.println("YES " + ori.toString());
                    return;
                }
            }
            System.out.println("NO");
    }

}




