package band;

public class Band extends MusicianGroup {
  private String name;
  public Band(String name){
    super();
    this.name=name;
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
        super.addMember(musician);
    else
      throw new IllegalArgumentException("There is already a member with the same instrument as the musician you are trying to add");
  }
}
