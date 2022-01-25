public class Main {
    public static void main(String[] args) {
        Person[] per = new Person[]{
                new Person("Илья Мамаев", "Джава-разработчик", "mamaevila@gmail.com", 895304618, 89000, 17),
                new Person("Александра Мартынова", "Биолог-психолог-программист", "mamaevila@gmail.com", 895304618,999999999,17),
                new Person("Нияз Сайфуллин", "Дрифтер", "mamaevila@gmail.com", 895304618,89000 , 43),
                new Person("Мамаев Артем", "Чемпион по BrawlStars", "mamaevila@gmail.com", 895304618, 454356346, 7 ),
                new Person("Лаптев Алексей", "Создатель мемов", "mamaevila@gmail.com", 895304618,0,76),
        };

        for (Person person : per) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}