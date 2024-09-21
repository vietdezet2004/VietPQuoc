import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

class Team{
    public static int cnt = 1;
    public String teamID, teamName, teamUni;
    
    public Team(String teamName, String teamUni){
        this.teamID = String.format("Team%02d", cnt++);
        this.teamName = teamName;
        this.teamUni = teamUni;
    }
}

class ThiSinh{
    public static int cnt = 1;
    public String ID, name, teamID;
    public Team team;
    
    public ThiSinh(String name, String teamID){
        this.ID = String.format("C%03d", cnt++);
        this.name = name;
        this.teamID = teamID;
    }
    
    @Override
    public String toString(){
        return ID + " " + name + " " + team.teamName + " " + team.teamUni;
    }
}

public class Danh_sach_thi_ICPC {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<ThiSinh> candidates = new ArrayList();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String teamName = sc.nextLine();
            String teamUni = sc.nextLine();
            Team team = new Team(teamName, teamUni);
            teams.add(team);
        }
        
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            String name = sc.nextLine();
            String teamID = sc.nextLine();
            ThiSinh candidate = new ThiSinh(name, teamID);
            for(Team team : teams){
                if(team.teamID.equals(teamID)){
                    candidate.team = team;
                    break;
                }
            }
            candidates.add(candidate);
        }
        
        candidates.sort(new Comparator<ThiSinh>(){
            @Override 
            public int compare(ThiSinh o1, ThiSinh o2){
                return o1.name.compareTo(o2.name);
            }
        });
        
        for(ThiSinh candidate : candidates){
            System.out.println(candidate);
        }
    }
}