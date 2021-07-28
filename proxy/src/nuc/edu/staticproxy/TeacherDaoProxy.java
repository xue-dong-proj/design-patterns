package nuc.edu.staticproxy;

/**
 * @author 薛东
 * @date 2021/7/26 10:31
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao teacher;

    public TeacherDaoProxy(ITeacherDao teache) {
        this.teacher = teache;
    }

    @Override
    public void teach() {
        System.out.println("授课开始...");
        teacher.teach();
        System.out.println("授课结束...");
    }
}
