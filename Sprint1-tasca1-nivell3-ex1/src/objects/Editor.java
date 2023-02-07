package objects;

import java.util.ArrayList;
import java.util.Objects;

public class Editor {

    private String name;
    final private String DNI;
    static private float salary;

    public ArrayList<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(ArrayList<News> newsList) {
        this.newsList = newsList;
    }

    private ArrayList<News> newsList = new ArrayList<>();


    public Editor(String name, String dni) {
        this.name = name;
        DNI = dni;
        this.salary = 1500f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public static float getSalary() {
        return salary;
    }

    public static void setSalary(float salary) {
        Editor.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editor editor = (Editor) o;
        return name.equals(editor.name) && DNI.equals(editor.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, DNI);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "name='" + name + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}

