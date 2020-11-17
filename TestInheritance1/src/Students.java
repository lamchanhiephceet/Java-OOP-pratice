public class Students extends People {
    private String id = "1";
    int math = 8, physical=9,chemistry=7;

    public Students() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    public float GPA() {
        return (this.math + this.physical + this.chemistry)/3;
    }
}
