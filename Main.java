public class Main {
    public static void main(String[] args) {
        ArrayCollection arrayCollection = new CustomArrayCollection();
        System.out.println(arrayCollection.size()); // 0
        arrayCollection.add(10);
        arrayCollection.add(20);
        arrayCollection.add(30);
        arrayCollection.add(40);
        System.out.println(arrayCollection.size()); // 4
        System.out.println(arrayCollection.contains(10)); // true
        System.out.println(arrayCollection.contains(100)); // false
        System.out.println(arrayCollection.findIndex(10)); // 0
        System.out.println(arrayCollection.findIndex(100)); // -1
        arrayCollection.add(50);
        arrayCollection.add(60);
        arrayCollection.add(70);
        arrayCollection.add(80);
        arrayCollection.add(90);
        arrayCollection.add(100);
        System.out.println(arrayCollection.size()); // 10
        arrayCollection.add(200);
        System.out.println(arrayCollection.size()); // 11
        System.out.println(arrayCollection.get(5)); // 60
        arrayCollection.remove(5);
        System.out.println(arrayCollection.get(5)); // 70
        System.out.println(arrayCollection.size()); // 10 again
    }
}
