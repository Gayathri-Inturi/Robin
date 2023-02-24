import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Sample{
    public static void main(String[] args) {
        List<String> teams=new ArrayList<>();
        teams.add("T1");
         teams.add("T2");
          teams.add("T3");
           teams.add("T4");
           teams.add("T5");
           Collections.shuffle(teams);
           List<String>Morning_session_teams=teams.subList(0,2);
           List<String>Evening_Session_teams=teams.subList(2,5);
           System.out.println("Morning session matches");
           for(int i=0;i<Morning_session_teams.size();i++){
            System.out.println(Morning_session_teams.get(i) + " vs " + Morning_session_teams.get((i+1)%Morning_session_teams.size()));
           }
           System.out.println("\nEvening session Matches");
           for(int j=0;j<Evening_Session_teams.size();j++){
            System.out.println(Evening_Session_teams.get(j) + " vs " + Evening_Session_teams.get((j+1)%Evening_Session_teams.size()));
           }
    }
}