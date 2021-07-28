package nuc.edu.game;

/**
 * @author 薛东
 * @date 2021/7/28 10:54
 */
public class GameRole {
    private int vit;
    private int def;

    public Memento createMemento(){
        return new Memento(vit,def);
    }

    public void removerGameRoleFromMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void display(){
        System.out.println("游戏角色当前的攻击力：" + this.vit + "  防御力: " + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
