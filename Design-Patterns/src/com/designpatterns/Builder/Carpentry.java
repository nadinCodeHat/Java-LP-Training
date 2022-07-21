package com.designpatterns.Builder;

public class Carpentry {
    private final String framing;
    private final String roofing;
    private final String shipCarpentry;
    private final String cabinetCarpentry;

    public Carpentry(Builder builder) {
        this.framing = builder.framing;
        this.roofing = builder.roofing;
        this.shipCarpentry = builder.shipCarpentry;
        this.cabinetCarpentry = builder.cabinetCarpentry;
    }

    static class Builder {
        private String framing;
        private String roofing;
        private String shipCarpentry;
        private String cabinetCarpentry;

        public Carpentry build() {
            return new Carpentry(this);
        }

        public Builder(String framing) {
            this.framing = framing;
        }

        public Builder roofing(String roofing) {
            this.roofing = roofing;
            return this;
        }

        public Builder shipCarpentry(String shipCarpentry){
            this.shipCarpentry = shipCarpentry;
            return this;
        }

        public Builder CabinetCarpentry(String cabinetCarpentry) {
            this.cabinetCarpentry = cabinetCarpentry;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Carpentry{" +
                "framing='" + framing + '\'' +
                ", roofing=" + roofing +
                ", shipCarpentry='" + shipCarpentry + '\'' +
                ", cabinetCarpentry='" + cabinetCarpentry + '\'' +
                '}';
    }
}
