public class Car
    {
        private static int lastId = 0;
        private int id;
        private String brand;
        private String model;
        private String color;
        private int quantity;
        private double price;

        public Car( String brand, String model, String color, int quantity, double price)
            {
                this.brand = brand;
                this.model = model;
                this.color = color;
                this.quantity = quantity;
                this.price = price;
                lastId++;
            }

        public void setId(int id)
            {
                this.id = id;
            }

        public void setBrand(String brand)
            {
                this.brand = brand;
            }

        public void setModel(String model)
            {
                this.model = model;
            }

        public void setColor(String color)
            {
                this.color = color;
            }

        public void setQuantity(int quantity)
            {
                this.quantity = quantity;
            }

        public void setPrice(double price)
            {
                this.price = price;
            }

        public int getId()
            {
                return id;
            }

        public String getBrand()
            {
                return brand;
            }

        public String getModel()
            {
                return model;
            }

        public String getColor()
            {
                return color;
            }

        public int getQuantity()
            {
                return quantity;
            }

        public double getPrice()
            {
                return price;
            }

        @Override
        public String toString()
            {
                return "Car{" +
                        "id=" + id +
                        ", brand='" + brand + '\'' +
                        ", model='" + model + '\'' +
                        ", color='" + color + '\'' +
                        ", quantity=" + quantity +
                        ", price=" + price +
                        '}';
            }
    }
