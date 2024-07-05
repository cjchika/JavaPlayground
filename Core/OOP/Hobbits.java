class Hobbits {
    String name;

    public static void main(String [] args) {

        Hobbits[] h = new Hobbits[3];

        for(int i = 0; i < h.length; i++){
            h[i] = new Hobbits();
            h[i].name = "bilbo";

            if (i == 1) {
                h[i].name = "frodo";
            }
            if (i == 2) {
                h[i].name = "sam";
            }

            System.out.print(h[i].name + " is a ");
            System.out.println("good Hobbit name");
        }

//        int z = 0;
//
//        while (z < 3) {
//
//            h[z] = new Hobbits();
//            h[z].name = "bilbo";
//
//            if (z == 1) {
//                h[z].name = "frodo";
//            }
//            if (z == 2) {
//                h[z].name = "sam";
//            }
//
//            System.out.print(h[z].name + " is a ");
//            System.out.println("good Hobbit name");
//
//            z = z + 1;
//        }
    }
}