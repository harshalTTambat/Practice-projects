
    public class Boat implements WaterVehicle
    {
        String name;
        int capacity;

        public Boat() {
            // empty
        }

        public Boat(String name, int capacity)
        {
            this.name = name;
            this.capacity = capacity;
        }
        @Override
        public String getVehicleName() {
            return name;
        } //

        @Override
        public int getVehicleCapacity() {
            return capacity;
        }
    }

