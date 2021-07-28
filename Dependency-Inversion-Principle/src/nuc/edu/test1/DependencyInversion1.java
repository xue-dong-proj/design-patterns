package nuc.edu.test1;

/**
 * @author 薛东
 * @date 2021/7/19 15:59
 */
public class DependencyInversion1 {
    public static void main(String[] args) {
        // 方式一：
        /*ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);*/

        // 方式二：
        /*ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose(changHong);
        openAndClose.open();*/

        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}

// 方式一：
/*interface IOpenAndClose{
    public void open(ITV tv);
}

interface ITV{
    public void play();
}

class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视打开了");
    }
}*/

// 方式二：
/*
interface IOpenAndClose{
    public void open();
}

interface ITV{
    public void play();
}

class OpenAndClose implements IOpenAndClose{
    public ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视打开了");
    }
}*/


interface IOpenAndClose{
    public void open();

    public void setTv(ITV tv);
}

interface ITV{
    public void play();
}

class OpenAndClose implements IOpenAndClose{
    public ITV tv;


    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视打开了");
    }
}