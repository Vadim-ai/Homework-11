public class Bicycle extends Transport implements Service {

        public Bicycle (String modelName,
                        int wheelsCount){
            super(modelName, wheelsCount);
        }

        public void updateTyre() {
            System.out.println("Меняем покрышку");
        }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
    }
    }
}

