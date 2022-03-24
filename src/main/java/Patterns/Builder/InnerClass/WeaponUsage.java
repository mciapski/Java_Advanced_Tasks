package Patterns.Builder.InnerClass;

import java.util.List;

public class WeaponUsage {
  public static void main(String[] args) {
    final Weapon laserGun = new Weapon.Builder()
        .withDamage(2)
        .withName("LaserGun")
        .withPerks(List.of("Color:red"))
        .withDurability(50L)
        .build();
  }
}
