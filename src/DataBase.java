public class DataBase<R, T> {
    private R id;
    private String name;
    private  T age;

    public DataBase(R id, String name, T age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public R getId() {
        return id;
    }

    public void setId(R id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public static <Z> void  printHello (Z valye) {
        System.out.println(valye);
    }
}
