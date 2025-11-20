public class IdGenerator {

    private static long next = 1;  

    public static long nextId() {
        long id = next;
        next++;
        return id;
    }

}
