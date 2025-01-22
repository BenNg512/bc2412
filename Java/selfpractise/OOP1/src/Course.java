public class Course {
    private String courseName;
    private int midTermMark;
    private int finalTermMark;

    public Course(String courseName, int midTermMark, int finalTermMark) {
        this.courseName = courseName;
        this.midTermMark = midTermMark;
        this.finalTermMark = finalTermMark;
    }

    public String getCourseName() {
        return this.courseName;
    }
    public int getMidTermMark() {
        return this.midTermMark;
    }
    public int getFinalTermMark() {
        return this.finalTermMark;
    }

    public double getAverageMark() {
        return (this.midTermMark + this.finalTermMark) / 2.0;
    }

    public String getGrade() {
        double averageMark = getAverageMark();
        if (averageMark >= 90) {
            return "A";
        } else if (averageMark >= 80) {
            return "B";
        } else if (averageMark >= 70) {
            return "C";
        } else if (averageMark >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setMidTermMark(int midTermMark) {
        this.midTermMark = midTermMark;
    }
    public void setFinalTermMark(int finalTermMark) {
        this.finalTermMark = finalTermMark;
    }

    public static void main(String[] args) throws Exception {
        
    }
}
