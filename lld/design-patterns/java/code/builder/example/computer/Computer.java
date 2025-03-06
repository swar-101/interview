package computer;

public class Computer {

    private final String HDD;
    private final String RAM;
    private final boolean isGraphicEnabled;
    private final boolean isBluetoothEnabled;

    public Computer(Builder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicEnabled = builder.isGraphicEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicEnabled() {
        return isGraphicEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        if (isBluetoothEnabled && isGraphicEnabled) {
            return "The computer with " + this.HDD + " HDD and " + RAM + " RAM, enabled with Graphics and Bluetooth " +
                    "is ready!";
        } else if (isBluetoothEnabled) {
            return "The computer with " + this.HDD + " HDD and " + RAM + " RAM, enabled with Bluetooth is ready!";
        } else if (isGraphicEnabled) {
            return "The computer with " + this.HDD + " HDD and " + RAM + " RAM, enabled with Graphics and Bluetooth " +
                    "is ready!";
        } else {
            return "The computer with " + this.HDD + " HDD and " + RAM + " RAM is ready!";
        }
    }

    public static class Builder {
        private String HDD;
        private String RAM;
        private boolean isGraphicEnabled;
        private boolean isBluetoothEnabled;

        public Builder HDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public Builder RAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder isGraphicEnabled(boolean isGraphicEnabled) {
            this.isGraphicEnabled = isGraphicEnabled;
            return this;
        }

        public Builder isBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}