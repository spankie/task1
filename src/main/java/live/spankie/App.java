package live.spankie;

import java.util.PriorityQueue;

/**
 * Task: Library Management!
 */
public final class App {
    private App() {
    }

    public static void TestQueue() {
        System.out.println("Hello World!");
        // create a queue of capacity 5
        CustomQueue q = new CustomQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());

        System.out.println("Queue size is " + q.size());

        q.dequeue();
        q.dequeue();

        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // TestQueue();
        Library library = new Library();
        Book thingsFallApart = new Book(1, "Things fall apart", "Things fall apart by chinua achebe");
        Book richestManInbabylon = new Book(1, "Richest man in babylon",
                "Richest man in babylon by george samuel clason");
        Book queensPremier = new Book(1, "Queens Premier", "Queens premier part 1");
        Book sugarGirl = new Book(1, "Sugar Girl", "Ralia the sugar girl");

        library.AddBook(thingsFallApart);
        library.AddBook(thingsFallApart);
        library.AddBook(richestManInbabylon);
        library.AddBook(queensPremier);
        library.AddBook(sugarGirl);

        Person student = new Person("Jide", "STUDENT");
        Person student2 = new Person("Bash", "STUDENT");
        Person tutor1 = new Person("Chibueze", "TUTOR");
        Person tutor2 = new Person("Esther", "TUTOR");

        String result1 = library.Borrow(thingsFallApart.getName(), student.getName());
        String result2 = library.Borrow(thingsFallApart.getName(), student.getName());
        System.out.println(result1);
        System.out.println(result2);

        // USING PRIORITYQUEUE
        // replace taken books
        library.AddBook(thingsFallApart);
        library.AddBook(thingsFallApart);
        PriorityQueue<Person> pp = new PriorityQueue<Person>();
        student.setBookToBorrow(thingsFallApart.getName());
        student2.setBookToBorrow(thingsFallApart.getName());
        tutor1.setBookToBorrow(thingsFallApart.getName());
        tutor2.setBookToBorrow(thingsFallApart.getName());
        pp.add(student);
        System.out.println(pp);
        System.out.println();
        pp.add(student2);
        System.out.println(pp);
        System.out.println();
        pp.add(tutor1);
        System.out.println(pp);
        System.out.println();
        pp.add(tutor2);
        System.out.println(pp);
        System.out.println();
        library.ProcessByPriority(pp);
    }

}
