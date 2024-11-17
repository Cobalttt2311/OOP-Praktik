import java.util.*; 

public class Example {
    public static void main(String[] args) {
        // Bagian 1: Menggunakan List untuk menyimpan nama
        List<String> Name = new ArrayList<>(); 
        Name.add("Nalendra Praja"); 
        Name.add("Ananda Dania");
        System.out.println("List awal: " + Name); 
        System.out.println("Nama pertama: " + Name.get(0)); 
        System.out.println("Ukuran Array: " + Name.size()); 
        
        // Menghapus elemen pada indeks 1
        Name.remove(1);
        System.out.println("List setelah dihapus: " + Name);

        // Iterasi dengan enhanced for loop
        for (String name : Name) {
            System.out.println(name);
        }

        // Iterasi dengan for loop tradisional
        for (int i = 0; i < Name.size(); i++) {
            System.out.println(Name.get(i));
        }

        //============================================================================================

        // Bagian 2: Menggunakan Set untuk menyimpan nama pemain
        Set<String> GoatSet = new HashSet<>(); 
        GoatSet.add("Cristiano Ronaldo"); 
        GoatSet.add("Lionel Messi"); // Duplikat tidak akan ditambahkan
        System.out.println("GoatSet: " + GoatSet);
        System.out.println("Ukuran GoatSet: " + GoatSet.size());

        // Menghapus Cristiano Ronaldo dari GoatSet
        GoatSet.remove("Cristiano Ronaldo");
        System.out.println("GoatSet setelah dihapus: " + GoatSet);
        System.out.println("Apakah Lionel Messi ada di GoatSet? " + GoatSet.contains("Lionel Messi"));
        
        // Bagian 3: Set kedua (TOTY) dengan nama pemain lain
        Set<String> TOTY = new HashSet<>(GoatSet);  // Salinan dari GoatSet
        TOTY.add("N'Golo Kante");
        TOTY.add("Toni Kroos");
        TOTY.add("Lionel Messi");

        System.out.println("TOTY: " + TOTY);

        // Mencari irisan antara GoatSet dan TOTY
        Set<String> intersection = new HashSet<>(GoatSet); // Salin GoatSet
        intersection.retainAll(TOTY); // Menyisakan elemen yang ada di kedua set

        // Menampilkan hasil irisan
        System.out.println("Irisan GoatSet dan TOTY: " + intersection);

        //============================================================================================

        // Bagian 4: Menggunakan Map untuk menyimpan pasangan kunci-nilai
        Map<Integer, String> GoatMap = new HashMap<>();
        GoatMap.put(7, "Cristiano Ronaldo");
        GoatMap.put(10, "Lionel Messi");
        GoatMap.put(9, "Marco Van Basten");
        System.out.println("Key 10: " + GoatMap.get(10));
        System.out.println("GoatMap: " + GoatMap);
        
        // Menghapus elemen dengan key 9
        GoatMap.remove(9);
        System.out.println("GoatMap setelah remove key 9: " + GoatMap);

        // Iterasi menggunakan keySet()
        for (Integer key : GoatMap.keySet()) {  
            System.out.println(key + " -> " + GoatMap.get(key));
        }

        // Iterasi menggunakan entrySet()
        for (Map.Entry<Integer, String> entry : GoatMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //============================================================================================

        // Bagian 5: Iterasi dengan Iterator dan menghapus berdasarkan key
        Iterator<Integer> it = GoatMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String value = GoatMap.get(key);
            System.out.println(key + " -> " + value);
            if (key == 10) it.remove();  // Menghapus entri dengan key 10
        }

        // Menampilkan nama pertama dalam List
        String nama = Name.get(0);
        System.out.println("Nama pertama di List: " + nama);
    }
}
