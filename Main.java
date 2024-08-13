public class Main {
    public static void main(String[] args) {
        StaticQueue<Integer> fila = new StaticQueue<>(5);

        fila.add(10);
        fila.add(20);
        fila.add(30);

        System.out.println("Removido: " + fila.remove());

        fila.add(40);
        fila.add(50);
        fila.add(60);

        System.out.println("Fila está cheia? " + fila.isFull());

        fila.clear();

        System.out.println("Fila está vazia? " + fila.isEmpty());
    }
}
