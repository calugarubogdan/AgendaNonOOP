/**
 * Created by Bogdan on 2/21/2015.
 *
 */

import java.util.*;

public class loto {

    public static void main(String[] args) {
        //List<Integer> user = Arrays.asList(1, 3, 7, 49, 34, 2);
        ArrayList<Integer> listUser = new ArrayList<Integer>();
        for (int j = 1; j < 50; j++) {
            listUser.add(new Integer(j));
        }
        Collections.shuffle(listUser);
        ArrayList<Integer> listuta1 = new ArrayList<Integer>();
        // nrgenerat
        System.out.println("prima lista este  ");
        for (int j = 0; j < 6; j++) {

            System.out.println(listUser.get(j));
            listuta1.add(listUser.get(j));
        }
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i < 50; i++) {
                list.add(new Integer(i));
            }
            Collections.shuffle(list);
            ArrayList<Integer> listuta = new ArrayList<Integer>();
            // nrgenerat
        System.out.println("A doua lista este:");
            for (int i = 0; i < 6; i++) {

                System.out.println(list.get(i));
                listuta.add(list.get(i));

            }

            Set<Integer> similar = new HashSet<Integer>(listuta1);
            similar.retainAll(listuta);
            if (similar.size() == 4) {
                System.out.println("Locul 3 :" + similar);
            }
            if (similar.size() == 5) {
                System.out.println("Locul 2 :" + similar);
            }
            if (similar.size() == 6) {
                System.out.println("Locul 1 :" + similar);
            }

            System.out.println("Ai ghicit numarul/numerele :  " + similar);

        }
    }


