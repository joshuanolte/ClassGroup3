/*
 *Model class, group.
 * @author Joshua Edward Nolte
 */

package za.ac.cput.domain;

public class Group {

    private int studentNumber;
    private String studentClass;
    private String studentName;

    //constructor
    public Group(int studentNumber, String studentClass, String studentName) {
        this.studentNumber = studentNumber;
        this.studentClass = studentClass;
        this.studentName = studentName;
    }
    //toString
    @Override
    public String toString() {
        return "Group{" +
                "studentnumber=" + studentNumber +
                ", studentclass='" + studentClass + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
