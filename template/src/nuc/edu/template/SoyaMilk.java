package nuc.edu.template;

/**
 * @author 薛东
 * @date 2021/7/26 15:37
 */
public abstract class SoyaMilk {
    void make (){
        select();
        if (needOrNonr()){
            add();
        }
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    abstract void add();

    void soak(){
        System.out.println("第三步：黄豆和配料开始浸泡，需要三小时");
    }

    void beat(){
        System.out.println("第四步：黄豆和配料放到豆浆机中打碎");
    }

    boolean needOrNonr(){
        return true;
    }

}
