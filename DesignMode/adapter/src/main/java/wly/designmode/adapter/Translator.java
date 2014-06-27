package wly.designmode.adapter;

/**
 * Created by wangliya on 14-1-25.
 */
public class Translator extends Player {

    private ForeignCenter foreignCenter;
    public Translator(String name) {
        super(name);
        foreignCenter = new ForeignCenter();
        foreignCenter.setName(name);
    }

    @Override
    public void Attack()
    {
        foreignCenter.JingGong();
    }

    @Override
    public void Defense()
    {
        foreignCenter.FangShou();
    }
}
