class Bicycle {
    private Wheel[] wheels;

    public Bicycle() {
        this.wheels = new Wheel[2];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }

    public void ride() {
        for (Wheel wheel : wheels) {
            wheel.rotate();
        }
        System.out.println("Велосипед едет");
    }
}
