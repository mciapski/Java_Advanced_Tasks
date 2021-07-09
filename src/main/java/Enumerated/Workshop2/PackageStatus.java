package Enumerated.Workshop2;

import java.util.ArrayList;
import java.util.List;

public enum PackageStatus {
  SENT("Wysłana"){
    @Override
    public List<PackageStatus> getNextStatuses(){
      System.out.println("You can choose TRAVELLING or COURIER");
      List<PackageStatus> lista = new ArrayList<>();
      lista.add(PackageStatus.COURIER);
      lista.add(PackageStatus.TRAVELLING);
      return lista;
    }
  },
  TRAVELLING("Podróżująca"){
    @Override
    public List<PackageStatus> getNextStatuses(){
      System.out.println("Returning null list");
      List<PackageStatus> lista = new ArrayList<>();
      lista = null;
      return lista;
    }
  },
  COURIER("Dowieziona przez kuriera"){
    @Override
    public List<PackageStatus> getNextStatuses(){
      System.out.println("You can choose SENT or TRAVELLING");
      List<PackageStatus> lista = new ArrayList<>();
      lista.add(PackageStatus.SENT);
      lista.add(PackageStatus.TRAVELLING);
      return lista;
    }
  },
  DELIVERED("Dostarczona"){
    @Override
    public List<PackageStatus> getNextStatuses(){
      System.out.println("You can choose LOST or RETURNED");
      List<PackageStatus> lista = new ArrayList<>();
      lista.add(PackageStatus.LOST);
      lista.add(PackageStatus.RETURNED);
      return lista;
    }
  },
  LOST("Zgubiona"),
  RETURNED("Zwrócona");

  String message;

  PackageStatus(String message) {

    this.message = message;
  }

  public List<PackageStatus> getNextStatuses(){
    List<PackageStatus> lista = new ArrayList<>();
    return lista;
  }
}
