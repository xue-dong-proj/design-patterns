package nuc.edu.staticproxy;

/**
 * @author 薛东
 * @date 2021/7/26 10:31
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师正在授课中...");
    }
}
