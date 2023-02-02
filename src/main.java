import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
//        DataBase<Integer, Double> dataBase = new DataBase(1,"test", 15);
//        DataBase<String, String> db = new DataBase("text", "test2","Text1");
//        System.out.println(dataBase.getId());
//        System.out.println(db.getId());
//        DataBase.<String>printHello("sos");
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(444);
//        list.add(2324);
//        list.add(443234);
//        list.add(44234);
//        list.add(44324);
//        list.add(44432);
//        list.add(44324);
//        list.add(43244);
//        System.out.println(list);
//        System.out.println(list.contains(4));
//        System.out.println(list.remove(4));
//        System.out.println(list.get(4));
//        for (Integer valye : list) {
//            System.out.println(valye); // for ech
//        }
        HashMap<String, Integer> map = new HashMap<>();
        map.put("firstel",1);
        map.put("secjnd",2);
        map.put("tird",1);
        System.out.println(map.get("firstel"));
        for (Map.Entry<String, Integer> value : map.entrySet()){
            System.out.println("ключ  " + value.getKey() + " значение" + value.getValue() );
        }
    }

}
