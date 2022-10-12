public interface ArrayCollection {
    void add(int element); // додати елемент

    int get(int index); // знайти елемент за індексом

    void remove(int index); // видалити за індексом

    int findIndex(int element); // знайти індекс елементу

    boolean contains(int element); // перевірити, чи є такий елемент в масиві/колекції.

    int size(); // повернути розмір колекції.
}
