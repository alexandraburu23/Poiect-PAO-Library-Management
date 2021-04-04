import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Section {
    private int section_id;
    private String name;


    public Section(int section_id, String name) {
        this.section_id = section_id;
        this.name = name;

    }
    public Section(int section_id, String name, List<Book> listBooks) {
        this.section_id = section_id;
        this.name = name;

    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Section{" +
                "section_id=" + section_id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return section_id == section.section_id && name.equals(section.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(section_id, name);
    }
}
