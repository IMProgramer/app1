package example.model;

import java.util.*;

public class Adviser{
       public List getAdvise(String x){
              List l = new ArrayList();
              if(x.equals("Army")){
                 l.add("Battle Field 3");
                 l.add("Call of Duty Black Ops");
              }else if(x.equals("Story")){
                    l.add("Resident Evil 4");
                    l.add("Far Cry 2");
                    l.add("Dishonored");
              }
              return l;
       }
}