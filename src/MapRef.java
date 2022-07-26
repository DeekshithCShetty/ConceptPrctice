import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapRef {
    public static void main(String[] args) {
        MapRef mapRef= new MapRef();
        check ch=new check();
       // MapRef.Info ij=new MapRef.Info();
        mapRef.validation();
    }

    void validation(){
        Info info=new Info("Deekshith","Shetty");
        List<Info> listInfo= new ArrayList<>();
        Map<String,Info> map = new HashMap<>();
        listInfo.add(info);
        System.out.println("ListInfo =>"+listInfo.get(0).getName());
        map.put("8660855358",info);
        Info altInfo=map.get("8660855358");
        altInfo.setName("Rakshith");
        System.out.println("ListInfo After change in Map =>"+listInfo.get(0).getName());

    }
    public  class Info{
        public String name;
        public String secondName;

        public Info() {

        }

        public Info(String name, String secondName) {
            this.name = name;
            this.secondName = secondName;
        }

        public String getName() {
            return name;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

