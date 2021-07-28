package nuc.edu.bridge;

/**
 * @author 薛东
 * @date 2021/7/22 21:38
 */
public class FolderPhone extends Phone{
    public FolderPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() { super.open();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    public void close() { super.close();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    public void call() { super.call();
        System.out.println(" 折叠样式手机 ");
    }
}
