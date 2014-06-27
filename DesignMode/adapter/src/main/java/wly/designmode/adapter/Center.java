package wly.designmode.adapter;

/**
 * Created by wangliya on 14-1-25.
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void Attack()
    {
        System.out.println("中锋 "+ name + " 进攻");
    }

    @Override
    public void Defense()
    {
        System.out.println("中锋 " + name + " 防守");
    }
}