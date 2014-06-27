package wly.designmode.adapter;

/**
 * Created by wangliya on 14-1-25.
 */
public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void Attack()
    {
        System.out.println("后卫 " + name + " 进攻");
    }

    @Override
    public void Defense()
    {
        System.out.println("后卫 " + name + " 防守");
    }
}
