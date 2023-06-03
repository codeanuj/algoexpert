import java.util.*;

class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    HashMap<String,Integer> map = new HashMap<>();
    String team, winner="";
    for(int i=0; i<results.size(); i++){
      team = competitions.get(i).get(results.get(i) == 0 ? 1 : 0);
      map.put(team, map.getOrDefault(team, 0) + 3);
      winner = map.get(team)>map.getOrDefault(winner, 0) ? team : winner;
    }
    return winner;
  }
}
