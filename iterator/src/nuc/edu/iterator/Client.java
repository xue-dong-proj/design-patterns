package nuc.edu.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/7/27 19:31
 */
public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<College>();


        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
//collegeList.add(infoCollege);


        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }
}
