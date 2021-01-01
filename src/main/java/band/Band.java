package band;

import instrument.InstrumentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Band {
  private Map<InstrumentType,Musician> members;
  private String name;
  public Band(String name){
    this.name=name;
    members=new HashMap<>();
  }

  public boolean hasMembersWithSameInstrument(Musician musician){
    return members.get(musician.getInstrument())==null;
  }

  public void addMember(Musician musician){
    if(hasMembersWithSameInstrument(musician))
      throw new IllegalArgumentException("There is already a member with the same instrument as the musician you are trying to add");
    members.put(musician.getInstrument().getType(),musician);

  }

  public void addMembers(List<Musician> musicians){
    for(Musician musician: musicians)
      addMember(musician);
  }

  public List<Musician> getMembers() {
    return new ArrayList<>(members.values());
  }

  public Musician getRandomMember(){
    return getMembers().get(new Random().nextInt(members.size()));
  }

  public void removeMember(Musician musician){
    if(members.remove(musician.getInstrument(),musician))
      return;
    throw new IllegalArgumentException("This musician is not in this band to be removed from it");
  }


}




