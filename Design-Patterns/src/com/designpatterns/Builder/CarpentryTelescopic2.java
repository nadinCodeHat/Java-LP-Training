package com.designpatterns.Builder;

public class CarpentryTelescopic2 {
    String framing;
    String roofing;
    String shipCarpentry;
    String CabinetCarpentry;


    public CarpentryTelescopic2(String framing, String roofing, String shipCarpentry, String CabinetCarpentry) {
        this.framing = framing;
        this.roofing = roofing;
        this.shipCarpentry = shipCarpentry;
        this.CabinetCarpentry = CabinetCarpentry;
    }

    public CarpentryTelescopic2(String framing, String roofing, String shipCarpentry){
        this(framing, roofing, shipCarpentry, null);
    }

    public CarpentryTelescopic2(String framing, String roofing) {
        this(framing, roofing, null);
    }

    public CarpentryTelescopic2(String framing) {
        this(framing, null);
    }

    @Override
    public String toString() {
        return "CarpentryTelescopic2{" +
                "framing='" + framing + '\'' +
                ", roofing=" + roofing +
                ", shipCarpentry='" + shipCarpentry + '\'' +
                ", CabinetCarpentry='" + CabinetCarpentry + '\'' +
                '}';
    }
}
