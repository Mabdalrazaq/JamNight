package band;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class MusicianGroup {
  private List<Musician> members;
  public MusicianGroup(){
    members=new ArrayList<Musician>();
  }

  public void addMember(Musician musician){
      members.add(musician);
  }

  public void addMembers(List<Musician> musicians){
    for(Musician musician: musicians)
      addMember(musician);
  }

  public List<Musician> getMembers() {
    return members;
  }

  public Musician getRandomMember(){
    return members.get(new Random().nextInt(members.size()));
  }

  public void removeMember(Musician musician){
    if(members.remove(musician))
      return;
    throw new IllegalArgumentException("This musician is not in this group to be removed from it");
  }

}
