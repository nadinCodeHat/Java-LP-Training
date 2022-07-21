package com.designpatterns.Builder;

public class CarpentryTelescopic1 {
    String framing;
    String roofing;
    String shipCarpentry;
    String cabinetCarpentry;

    public CarpentryTelescopic1(String framing) {
        this.framing = framing;
    }

    public CarpentryTelescopic1(String framing, String roofing) {
        this(framing);
        this.roofing = roofing;
    }

    public CarpentryTelescopic1(String framing, String roofing, String shipCarpentry) {
        this(framing, roofing);
        this.shipCarpentry = shipCarpentry;
    }

    public CarpentryTelescopic1(String framing, String roofing, String shipCarpentry, String cabinetCarpentry) {
        this(framing, roofing, shipCarpentry);
        this.cabinetCarpentry = cabinetCarpentry;
    }

    @Override
    public String toString() {
        return "CarpentryTelescopic1{" +
                "framing='" + framing + '\'' +
                ", roofing=" + roofing +
                ", shipCarpentry='" + shipCarpentry + '\'' +
                ", cabinetCarpentry='" + cabinetCarpentry + '\'' +
                '}';
    }
}
