package inter;

class Horse implements Animal, Herbivore{
    @Override
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
//Multiple inheritance is done by Interfaces.
