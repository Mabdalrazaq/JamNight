package band;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Band {
  private List<Musician> members;
  private String name;
  public Band(String name){
    this.name=name;
    members=new ArrayList<Musician>();
  }

  public boolean hasNoMembersWithSameInstrument(Musician musician){
    for(Musician member: getMembers()){
      if(member.compareInstrument(musician))
        return false;
    }
    return true;
  }

  public void addMember(Musician musician){
    if(hasNoMembersWithSameInstrument(musician))
        members.add(musician);
    else
      throw new IllegalArgumentException("There is already a member with the same instrument as the musician you are trying to add");
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
    throw new IllegalArgumentException("This musician is not in this band to be removed from it");
  }


}




