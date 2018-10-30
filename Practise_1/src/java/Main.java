import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) {
         new ServerListener().start();
      /*  Map<Integer, List<String>> user = new HashMap<>();


        try{
            InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\bingo\\Desktop\\user.txt"), "UTF-8");
            BufferedReader reader = new BufferedReader(isr);
            String msg = null;
            while((msg = reader.readLine()) != null){
                String name = msg.substring(0,msg.indexOf(" "));
                Integer age = Integer.valueOf(msg.substring(msg.indexOf(" ")+1));
                if (user.containsKey(age)){
                    List<String> arr = user.get(age);
                    arr.add(name);
                    user.put(age,arr);
                }else {
                    ArrayList<String> dataSource = new ArrayList<>();
                    dataSource.add(name);
                    user.put(age, dataSource);
                }

            }



        }catch(Exception e){

        }
       *//* Map<Integer, List<String>> user = dataSource.stream().map(data -> data.split(" ")).collect(toMap(
                data -> data[0],
                data -> Lists.newArrayList(data[1]),
                (List<String> oldList, List<String> newList) -> {
                    oldList.add(newList);
                    return oldList;
                }));*//*
        user.forEach((k,v)->System.out.println(k+" "+v));*/

    }
}
