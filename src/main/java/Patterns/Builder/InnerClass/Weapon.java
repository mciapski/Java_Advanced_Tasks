package Patterns.Builder.InnerClass;

import java.util.List;

public class Weapon {
  private String type;
  private String name;
  private Integer damage;
  private Long durability;
  private List<String> perks;

  public Weapon(String type, String name, Integer damage, Long durability, List<String> perks) {
    this.type = type;
    this.name = name;
    this.damage = damage;
    this.durability = durability;
    this.perks = perks;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getDamage() {
    return damage;
  }

  public void setDamage(Integer damage) {
    this.damage = damage;
  }

  public Long getDurability() {
    return durability;
  }

  public void setDurability(Long durability) {
    this.durability = durability;
  }

  public List<String> getPerks() {
    return perks;
  }

  public void setPerks(List<String> perks) {
    this.perks = perks;
  }

  public static class Builder {
    private String type;
    private String name;
    private Integer damage;
    private Long durability;
    private List<String> perks;

    public Builder withType(String type){
      this.type = type;
      return this;
    }
    public Builder withName(String name){
      this.name = name;
      return this;
    }
    public Builder withDamage(Integer damage){
      this.damage = damage;
      return this;
    }
    public Builder withDurability(Long durability){
      this.durability = durability;
      return this;
    }
    public Builder withPerks(List<String> perks){
      this.perks = perks;
      return this;
    }
    public Weapon build(){
      return new Weapon(type,name,damage,durability,perks);
    }

  }

}
