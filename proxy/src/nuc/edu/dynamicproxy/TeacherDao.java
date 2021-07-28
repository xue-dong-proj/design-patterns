package nuc.edu.dynamicproxy;

/**
 * @author 薛东
 * @date 2021/7/26 11:10
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师开始授课");
    }
}
