public class studentsdatbase {
    public static void main(String[] args) {
        students[] student = new students[5];

        students aathi = new students(1911059, "aathi", 45.6f);
        students ganesh = new students(1911069, "ganesh", 88.3f);
        // aathi.greeting();
        // System.out.println(ganesh.rollnumber);
        students random = new students(aathi);
        // System.out.println(random.rollnumber);
        students one = new students(12, "aathiharish", 55.7f);
        students two = one;
        two.name = "jegan";
        System.out.println(one.name);

    }
}

class students {
    int rollnumber;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello Every one" + " " + this.name);
    }

    students(int rollnumber, String name, float marks) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.marks = marks;
    }

    students(students other) {
        this.rollnumber = other.rollnumber;
        this.name = other.name;
        this.marks = other.marks;
    }

}